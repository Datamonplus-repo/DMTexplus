package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tlectorwwexport extends GXProcedure
{
   public tlectorwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlectorwwexport.class ), "" );
   }

   public tlectorwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tlectorwwexport.this.aP1 = new String[] {""};
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
      tlectorwwexport.this.aP0 = aP0;
      tlectorwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TLECTORWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79FilterFullText, GXv_char5) ;
      tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV46TFLecMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFLecMaqCod_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFLecMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFLecMaqCod, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV81TFLecHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFLecHdr_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFLecHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFLecHdr, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFLecOpeCod) && (0==AV56TFLecOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFLecOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFLecOpeCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV83TFlecOpeNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFlecOpeNom_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFlecOpeNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFlecOpeNom, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFLecFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFLecFasCod_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFLecFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFLecFasCod, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFLecFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFLecFasDsc_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFLecFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFLecFasDsc, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV63TFLecFasOrd) && (0==AV64TFLecFasOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFLecFasOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFLecFasOrd_To );
      }
      if ( ! ( (0==AV65TFLecParCod) && (0==AV66TFLecParCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV65TFLecParCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV66TFLecParCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV87TFLecParNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFLecParNom_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV86TFLecParNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFLecParNom, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV70TFLecHor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFLecHor_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFLecHor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFLecHor, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFLecFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV71TFLecFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV74TFLecTipEnt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFLecTipEnt_Sel, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFLecTipEnt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFLecTipEnt, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV77TFLecEstado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tlectorwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV75i = 1 ;
         AV90GXV1 = 1 ;
         while ( AV90GXV1 <= AV77TFLecEstado_Sels.size() )
         {
            AV78TFLecEstado_Sel = (String)AV77TFLecEstado_Sels.elementAt(-1+AV90GXV1) ;
            if ( AV75i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV78TFLecEstado_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Proceso", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV78TFLecEstado_Sel), httpContext.getMessage( "F", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Finalizadas", "") );
            }
            AV75i = (long)(AV75i+1) ;
            AV90GXV1 = (int)(AV90GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("TLECTORWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("TLECTORWWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV91GXV2 = 1 ;
      while ( AV91GXV2 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV91GXV2));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV91GXV2 = (int)(AV91GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV93Tlectorwwds_1_filterfulltext = AV79FilterFullText ;
      AV94Tlectorwwds_2_tflecmaqcod = AV45TFLecMaqCod ;
      AV95Tlectorwwds_3_tflecmaqcod_sel = AV46TFLecMaqCod_Sel ;
      AV96Tlectorwwds_4_tflechdr = AV80TFLecHdr ;
      AV97Tlectorwwds_5_tflechdr_sel = AV81TFLecHdr_Sel ;
      AV98Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV99Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV100Tlectorwwds_8_tflecopenom = AV82TFlecOpeNom ;
      AV101Tlectorwwds_9_tflecopenom_sel = AV83TFlecOpeNom_Sel ;
      AV102Tlectorwwds_10_tflecfascod = AV59TFLecFasCod ;
      AV103Tlectorwwds_11_tflecfascod_sel = AV60TFLecFasCod_Sel ;
      AV104Tlectorwwds_12_tflecfasdsc = AV84TFLecFasDsc ;
      AV105Tlectorwwds_13_tflecfasdsc_sel = AV85TFLecFasDsc_Sel ;
      AV106Tlectorwwds_14_tflecfasord = AV63TFLecFasOrd ;
      AV107Tlectorwwds_15_tflecfasord_to = AV64TFLecFasOrd_To ;
      AV108Tlectorwwds_16_tflecparcod = AV65TFLecParCod ;
      AV109Tlectorwwds_17_tflecparcod_to = AV66TFLecParCod_To ;
      AV110Tlectorwwds_18_tflecparnom = AV86TFLecParNom ;
      AV111Tlectorwwds_19_tflecparnom_sel = AV87TFLecParNom_Sel ;
      AV112Tlectorwwds_20_tflechor = AV69TFLecHor ;
      AV113Tlectorwwds_21_tflechor_sel = AV70TFLecHor_Sel ;
      AV114Tlectorwwds_22_tflecfec = AV71TFLecFec ;
      AV115Tlectorwwds_23_tflectipent = AV73TFLecTipEnt ;
      AV116Tlectorwwds_24_tflectipent_sel = AV74TFLecTipEnt_Sel ;
      AV117Tlectorwwds_25_tflecestado_sels = AV77TFLecEstado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV117Tlectorwwds_25_tflecestado_sels ,
                                           AV95Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV94Tlectorwwds_2_tflecmaqcod ,
                                           AV97Tlectorwwds_5_tflechdr_sel ,
                                           AV96Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV98Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV99Tlectorwwds_7_tflecopecod_to) ,
                                           AV103Tlectorwwds_11_tflecfascod_sel ,
                                           AV102Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV106Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV107Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV108Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV109Tlectorwwds_17_tflecparcod_to) ,
                                           AV113Tlectorwwds_21_tflechor_sel ,
                                           AV112Tlectorwwds_20_tflechor ,
                                           AV114Tlectorwwds_22_tflecfec ,
                                           AV116Tlectorwwds_24_tflectipent_sel ,
                                           AV115Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV93Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV101Tlectorwwds_9_tflecopenom_sel ,
                                           AV100Tlectorwwds_8_tflecopenom ,
                                           AV105Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV104Tlectorwwds_12_tflecfasdsc ,
                                           AV111Tlectorwwds_19_tflecparnom_sel ,
                                           AV110Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV117Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV94Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV94Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV96Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV96Tlectorwwds_4_tflechdr), 11, "%") ;
      lV102Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV102Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV112Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV112Tlectorwwds_20_tflechor), 8, "%") ;
      lV115Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV115Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B82 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV117Tlectorwwds_25_tflecestado_sels.size()), lV94Tlectorwwds_2_tflecmaqcod, AV95Tlectorwwds_3_tflecmaqcod_sel, lV96Tlectorwwds_4_tflechdr, AV97Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV98Tlectorwwds_6_tflecopecod), Integer.valueOf(AV99Tlectorwwds_7_tflecopecod_to), lV102Tlectorwwds_10_tflecfascod, AV103Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV106Tlectorwwds_14_tflecfasord), Short.valueOf(AV107Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV108Tlectorwwds_16_tflecparcod), Short.valueOf(AV109Tlectorwwds_17_tflecparcod_to), lV112Tlectorwwds_20_tflechor, AV113Tlectorwwds_21_tflechor_sel, AV114Tlectorwwds_22_tflecfec, lV115Tlectorwwds_23_tflectipent, AV116Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P08B82_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B82_n1796LecTipEnt[0] ;
         A1174LecFec = P08B82_A1174LecFec[0] ;
         n1174LecFec = P08B82_n1174LecFec[0] ;
         A1173LecHor = P08B82_A1173LecHor[0] ;
         n1173LecHor = P08B82_n1173LecHor[0] ;
         A13721LecHdr = P08B82_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B82_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B82_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B82_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B82_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B82_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B82_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B82_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B82_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B82_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B82_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B82_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B82_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B82_n1171LecFasCod[0] ;
         A1172LecParCod = P08B82_A1172LecParCod[0] ;
         n1172LecParCod = P08B82_n1172LecParCod[0] ;
         A396EmprCod = P08B82_A396EmprCod[0] ;
         GXt_char4 = A13722LecEstado ;
         GXv_char5[0] = GXt_char4 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char5) ;
         tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
         A13722LecEstado = GXt_char4 ;
         if ( ( AV117Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV117Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char4 = A14259lecOpeNom ;
            GXv_char5[0] = GXt_char4 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char5) ;
            tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
            A14259lecOpeNom = GXt_char4 ;
            if ( ! ( (GXutil.strcmp("", AV101Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV100Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV100Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV101Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV101Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char4 = A14260LecFasDsc ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char5) ;
                  tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                  A14260LecFasDsc = GXt_char4 ;
                  if ( ! ( (GXutil.strcmp("", AV105Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV104Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV105Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV105Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char4 = A14261LecParNom ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char5) ;
                        tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                        A14261LecParNom = GXt_char4 ;
                        if ( (GXutil.strcmp("", AV93Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV93Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV93Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV93Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV111Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV110Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV111Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV111Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV13CellRow = (int)(AV13CellRow+1) ;
                                 /* Execute user subroutine: 'BEFOREWRITELINE' */
                                 S172 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 AV42VisibleColumnCount = 0 ;
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1166LecMaqCod, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13721LecHdr, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A1170LecOpeCod );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14259lecOpeNom, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1171LecFasCod, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14260LecFasDsc, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A1188LecFasOrd );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A1172LecParCod );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14261LecParNom, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1173LecHor, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A1174LecFec );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1796LecTipEnt, GXv_char5) ;
                                    tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( "" );
                                    if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "P", "")) == 0 )
                                    {
                                       AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Proceso", "") );
                                    }
                                    else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "F", "")) == 0 )
                                    {
                                       AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
                                    }
                                    AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
                                 }
                                 /* Execute user subroutine: 'AFTERWRITELINE' */
                                 S182 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecMaqCod", "", "Maquina", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecHdr", "", "Hdr", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecOpeCod", "", "Operario", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "lecOpeNom", "", "Nombre", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasCod", "", "Fase", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasDsc", "", "Descripcion", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasOrd", "", "Orden", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecParCod", "", "Paro", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecParNom", "", "Descripcion", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecHor", "", "Hora", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFec", "", "Fecha", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecTipEnt", "", "Tipo", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecEstado", "", "Estado", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TLECTORWWColumnsSelector", GXv_char5) ;
      tlectorwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("TLECTORWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TLECTORWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("TLECTORWWGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV118GXV3 = 1 ;
      while ( AV118GXV3 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV3));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV79FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV45TFLecMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV46TFLecMaqCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV80TFLecHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV81TFLecHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV55TFLecOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFLecOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV82TFlecOpeNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV83TFlecOpeNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV59TFLecFasCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD_SEL") == 0 )
         {
            AV60TFLecFasCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV84TFLecFasDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV85TFLecFasDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV63TFLecFasOrd = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFLecFasOrd_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV65TFLecParCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFLecParCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV86TFLecParNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV87TFLecParNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV69TFLecHor = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR_SEL") == 0 )
         {
            AV70TFLecHor_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV71TFLecFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV73TFLecTipEnt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT_SEL") == 0 )
         {
            AV74TFLecTipEnt_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV76TFLecEstado_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV77TFLecEstado_Sels.fromJSonString(AV76TFLecEstado_SelsJson, null);
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
      this.aP0[0] = tlectorwwexport.this.AV11Filename;
      this.aP1[0] = tlectorwwexport.this.AV12ErrorMessage;
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
      AV79FilterFullText = "" ;
      AV46TFLecMaqCod_Sel = "" ;
      AV45TFLecMaqCod = "" ;
      AV81TFLecHdr_Sel = "" ;
      AV80TFLecHdr = "" ;
      AV83TFlecOpeNom_Sel = "" ;
      AV82TFlecOpeNom = "" ;
      AV60TFLecFasCod_Sel = "" ;
      AV59TFLecFasCod = "" ;
      AV85TFLecFasDsc_Sel = "" ;
      AV84TFLecFasDsc = "" ;
      AV87TFLecParNom_Sel = "" ;
      AV86TFLecParNom = "" ;
      AV70TFLecHor_Sel = "" ;
      AV69TFLecHor = "" ;
      AV71TFLecFec = GXutil.nullDate() ;
      AV74TFLecTipEnt_Sel = "" ;
      AV73TFLecTipEnt = "" ;
      AV77TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV78TFLecEstado_Sel = "" ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1166LecMaqCod = "" ;
      A13721LecHdr = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV93Tlectorwwds_1_filterfulltext = "" ;
      AV94Tlectorwwds_2_tflecmaqcod = "" ;
      AV95Tlectorwwds_3_tflecmaqcod_sel = "" ;
      AV96Tlectorwwds_4_tflechdr = "" ;
      AV97Tlectorwwds_5_tflechdr_sel = "" ;
      AV100Tlectorwwds_8_tflecopenom = "" ;
      AV101Tlectorwwds_9_tflecopenom_sel = "" ;
      AV102Tlectorwwds_10_tflecfascod = "" ;
      AV103Tlectorwwds_11_tflecfascod_sel = "" ;
      AV104Tlectorwwds_12_tflecfasdsc = "" ;
      AV105Tlectorwwds_13_tflecfasdsc_sel = "" ;
      AV110Tlectorwwds_18_tflecparnom = "" ;
      AV111Tlectorwwds_19_tflecparnom_sel = "" ;
      AV112Tlectorwwds_20_tflechor = "" ;
      AV113Tlectorwwds_21_tflechor_sel = "" ;
      AV114Tlectorwwds_22_tflecfec = GXutil.nullDate() ;
      AV115Tlectorwwds_23_tflectipent = "" ;
      AV116Tlectorwwds_24_tflectipent_sel = "" ;
      AV117Tlectorwwds_25_tflecestado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV94Tlectorwwds_2_tflecmaqcod = "" ;
      lV96Tlectorwwds_4_tflechdr = "" ;
      lV102Tlectorwwds_10_tflecfascod = "" ;
      lV112Tlectorwwds_20_tflechor = "" ;
      lV115Tlectorwwds_23_tflectipent = "" ;
      A1169LecBarPar = "" ;
      P08B82_A1796LecTipEnt = new String[] {""} ;
      P08B82_n1796LecTipEnt = new boolean[] {false} ;
      P08B82_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B82_n1174LecFec = new boolean[] {false} ;
      P08B82_A1173LecHor = new String[] {""} ;
      P08B82_n1173LecHor = new boolean[] {false} ;
      P08B82_A13721LecHdr = new String[] {""} ;
      P08B82_A1166LecMaqCod = new String[] {""} ;
      P08B82_A1188LecFasOrd = new short[1] ;
      P08B82_n1188LecFasOrd = new boolean[] {false} ;
      P08B82_A1169LecBarPar = new String[] {""} ;
      P08B82_n1169LecBarPar = new boolean[] {false} ;
      P08B82_A1168LecBarReo = new byte[1] ;
      P08B82_n1168LecBarReo = new boolean[] {false} ;
      P08B82_A1167LecBarCod = new int[1] ;
      P08B82_n1167LecBarCod = new boolean[] {false} ;
      P08B82_A1170LecOpeCod = new int[1] ;
      P08B82_n1170LecOpeCod = new boolean[] {false} ;
      P08B82_A1171LecFasCod = new String[] {""} ;
      P08B82_n1171LecFasCod = new boolean[] {false} ;
      P08B82_A1172LecParCod = new short[1] ;
      P08B82_n1172LecParCod = new boolean[] {false} ;
      P08B82_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76TFLecEstado_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorwwexport__default(),
         new Object[] {
             new Object[] {
            P08B82_A1796LecTipEnt, P08B82_n1796LecTipEnt, P08B82_A1174LecFec, P08B82_n1174LecFec, P08B82_A1173LecHor, P08B82_n1173LecHor, P08B82_A13721LecHdr, P08B82_A1166LecMaqCod, P08B82_A1188LecFasOrd, P08B82_n1188LecFasOrd,
            P08B82_A1169LecBarPar, P08B82_n1169LecBarPar, P08B82_A1168LecBarReo, P08B82_n1168LecBarReo, P08B82_A1167LecBarCod, P08B82_n1167LecBarCod, P08B82_A1170LecOpeCod, P08B82_n1170LecOpeCod, P08B82_A1171LecFasCod, P08B82_n1171LecFasCod,
            P08B82_A1172LecParCod, P08B82_n1172LecParCod, P08B82_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private short AV63TFLecFasOrd ;
   private short AV64TFLecFasOrd_To ;
   private short AV65TFLecParCod ;
   private short AV66TFLecParCod_To ;
   private short GXv_int3[] ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV106Tlectorwwds_14_tflecfasord ;
   private short AV107Tlectorwwds_15_tflecfasord_to ;
   private short AV108Tlectorwwds_16_tflecparcod ;
   private short AV109Tlectorwwds_17_tflecparcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55TFLecOpeCod ;
   private int AV56TFLecOpeCod_To ;
   private int AV90GXV1 ;
   private int AV91GXV2 ;
   private int A1170LecOpeCod ;
   private int AV98Tlectorwwds_6_tflecopecod ;
   private int AV99Tlectorwwds_7_tflecopecod_to ;
   private int AV117Tlectorwwds_25_tflecestado_sels_size ;
   private int A1167LecBarCod ;
   private int AV118GXV3 ;
   private long AV75i ;
   private long AV42VisibleColumnCount ;
   private String AV46TFLecMaqCod_Sel ;
   private String AV45TFLecMaqCod ;
   private String AV81TFLecHdr_Sel ;
   private String AV80TFLecHdr ;
   private String AV83TFlecOpeNom_Sel ;
   private String AV82TFlecOpeNom ;
   private String AV60TFLecFasCod_Sel ;
   private String AV59TFLecFasCod ;
   private String AV85TFLecFasDsc_Sel ;
   private String AV84TFLecFasDsc ;
   private String AV87TFLecParNom_Sel ;
   private String AV86TFLecParNom ;
   private String AV70TFLecHor_Sel ;
   private String AV69TFLecHor ;
   private String AV74TFLecTipEnt_Sel ;
   private String AV73TFLecTipEnt ;
   private String AV78TFLecEstado_Sel ;
   private String A1166LecMaqCod ;
   private String A13721LecHdr ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String A13722LecEstado ;
   private String AV94Tlectorwwds_2_tflecmaqcod ;
   private String AV95Tlectorwwds_3_tflecmaqcod_sel ;
   private String AV96Tlectorwwds_4_tflechdr ;
   private String AV97Tlectorwwds_5_tflechdr_sel ;
   private String AV100Tlectorwwds_8_tflecopenom ;
   private String AV101Tlectorwwds_9_tflecopenom_sel ;
   private String AV102Tlectorwwds_10_tflecfascod ;
   private String AV103Tlectorwwds_11_tflecfascod_sel ;
   private String AV104Tlectorwwds_12_tflecfasdsc ;
   private String AV105Tlectorwwds_13_tflecfasdsc_sel ;
   private String AV110Tlectorwwds_18_tflecparnom ;
   private String AV111Tlectorwwds_19_tflecparnom_sel ;
   private String AV112Tlectorwwds_20_tflechor ;
   private String AV113Tlectorwwds_21_tflechor_sel ;
   private String AV115Tlectorwwds_23_tflectipent ;
   private String AV116Tlectorwwds_24_tflectipent_sel ;
   private String scmdbuf ;
   private String lV94Tlectorwwds_2_tflecmaqcod ;
   private String lV96Tlectorwwds_4_tflechdr ;
   private String lV102Tlectorwwds_10_tflecfascod ;
   private String lV112Tlectorwwds_20_tflechor ;
   private String lV115Tlectorwwds_23_tflectipent ;
   private String A1169LecBarPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV71TFLecFec ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV114Tlectorwwds_22_tflecfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV76TFLecEstado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV79FilterFullText ;
   private String AV93Tlectorwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private GXSimpleCollection<String> AV77TFLecEstado_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08B82_A1796LecTipEnt ;
   private boolean[] P08B82_n1796LecTipEnt ;
   private java.util.Date[] P08B82_A1174LecFec ;
   private boolean[] P08B82_n1174LecFec ;
   private String[] P08B82_A1173LecHor ;
   private boolean[] P08B82_n1173LecHor ;
   private String[] P08B82_A13721LecHdr ;
   private String[] P08B82_A1166LecMaqCod ;
   private short[] P08B82_A1188LecFasOrd ;
   private boolean[] P08B82_n1188LecFasOrd ;
   private String[] P08B82_A1169LecBarPar ;
   private boolean[] P08B82_n1169LecBarPar ;
   private byte[] P08B82_A1168LecBarReo ;
   private boolean[] P08B82_n1168LecBarReo ;
   private int[] P08B82_A1167LecBarCod ;
   private boolean[] P08B82_n1167LecBarCod ;
   private int[] P08B82_A1170LecOpeCod ;
   private boolean[] P08B82_n1170LecOpeCod ;
   private String[] P08B82_A1171LecFasCod ;
   private boolean[] P08B82_n1171LecFasCod ;
   private short[] P08B82_A1172LecParCod ;
   private boolean[] P08B82_n1172LecParCod ;
   private String[] P08B82_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV117Tlectorwwds_25_tflecestado_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class tlectorwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV117Tlectorwwds_25_tflecestado_sels ,
                                          String AV95Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV94Tlectorwwds_2_tflecmaqcod ,
                                          String AV97Tlectorwwds_5_tflechdr_sel ,
                                          String AV96Tlectorwwds_4_tflechdr ,
                                          int AV98Tlectorwwds_6_tflecopecod ,
                                          int AV99Tlectorwwds_7_tflecopecod_to ,
                                          String AV103Tlectorwwds_11_tflecfascod_sel ,
                                          String AV102Tlectorwwds_10_tflecfascod ,
                                          short AV106Tlectorwwds_14_tflecfasord ,
                                          short AV107Tlectorwwds_15_tflecfasord_to ,
                                          short AV108Tlectorwwds_16_tflecparcod ,
                                          short AV109Tlectorwwds_17_tflecparcod_to ,
                                          String AV113Tlectorwwds_21_tflechor_sel ,
                                          String AV112Tlectorwwds_20_tflechor ,
                                          java.util.Date AV114Tlectorwwds_22_tflecfec ,
                                          String AV116Tlectorwwds_24_tflectipent_sel ,
                                          String AV115Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV93Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV101Tlectorwwds_9_tflecopenom_sel ,
                                          String AV100Tlectorwwds_8_tflecopenom ,
                                          String AV105Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV104Tlectorwwds_12_tflecfasdsc ,
                                          String AV111Tlectorwwds_19_tflecparnom_sel ,
                                          String AV110Tlectorwwds_18_tflecparnom ,
                                          int AV117Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[18];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV95Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV96Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV102Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV106Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV107Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV108Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV109Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV112Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV115Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_P08B82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

