package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwanalisiscostesquimicossexport extends GXProcedure
{
   public wcwanalisiscostesquimicossexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwanalisiscostesquimicossexport.class ), "" );
   }

   public wcwanalisiscostesquimicossexport( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcwanalisiscostesquimicossexport.this.aP1 = new String[] {""};
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
      wcwanalisiscostesquimicossexport.this.aP0 = aP0;
      wcwanalisiscostesquimicossexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCWAnalisisCostesQuimicossExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97FilterFullText, GXv_char5) ;
      wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFHreFecTin)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Cierre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV33TFHreFecTin );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHreBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHreBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFHreBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFHreBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHreTotKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHreTotKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Tot", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFHreTotKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFHreTotKgm_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV44TFHreMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFHreMaqCod_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFHreMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFHreMaqCod, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFHreVolPrd) && (0==AV46TFHreVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFHreVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFHreVolPrd_To );
      }
      if ( ! ( (0==AV50TFCliCod) && (0==AV51TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFCliNom_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFCliNom, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFHreBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFHreBarSer_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFHreBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFHreBarSer, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFHreBarDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFHreBarDsc_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFHreBarDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFHreBarDsc, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFHreTipArtD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFHreTipArtD_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFHreTipArtD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFHreTipArtD, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFHreColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFHreColNom_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFHreColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFHreColNom, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV62TFHreColNum) && (0==AV63TFHreColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFHreColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFHreColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV65TFHreTipColN_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFHreTipColN_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFHreTipColN)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFHreTipColN, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFHreIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFHreIntDsc_Sel, GXv_char5) ;
         wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFHreIntDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFHreIntDsc, GXv_char5) ;
            wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV93TFHreDti) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV93TFHreDti );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV95TFHreDtf) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwanalisiscostesquimicossexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV95TFHreDtf );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV17Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV17Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV100GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV102Wcwanalisiscostesquimicossds_1_filterfulltext = AV97FilterFullText ;
      AV103Wcwanalisiscostesquimicossds_2_tfhrefectin = AV33TFHreFecTin ;
      AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV41TFHreTotKgm ;
      AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV42TFHreTotKgm_To ;
      AV108Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV43TFHreMaqCod ;
      AV109Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV44TFHreMaqCod_Sel ;
      AV110Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV45TFHreVolPrd ;
      AV111Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV46TFHreVolPrd_To ;
      AV112Wcwanalisiscostesquimicossds_11_tfclicod = AV50TFCliCod ;
      AV113Wcwanalisiscostesquimicossds_12_tfclicod_to = AV51TFCliCod_To ;
      AV114Wcwanalisiscostesquimicossds_13_tfclinom = AV52TFCliNom ;
      AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV53TFCliNom_Sel ;
      AV116Wcwanalisiscostesquimicossds_15_tfhrebarser = AV54TFHreBarSer ;
      AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV55TFHreBarSer_Sel ;
      AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV56TFHreBarDsc ;
      AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV57TFHreBarDsc_Sel ;
      AV120Wcwanalisiscostesquimicossds_19_tfhretipartd = AV58TFHreTipArtD ;
      AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV59TFHreTipArtD_Sel ;
      AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV60TFHreColNom ;
      AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV61TFHreColNom_Sel ;
      AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV62TFHreColNum ;
      AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV63TFHreColNum_To ;
      AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV64TFHreTipColN ;
      AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV65TFHreTipColN_Sel ;
      AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV67TFHreIntDsc ;
      AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV68TFHreIntDsc_Sel ;
      AV130Wcwanalisiscostesquimicossds_29_tfhredti = AV93TFHreDti ;
      AV131Wcwanalisiscostesquimicossds_30_tfhredtf = AV95TFHreDtf ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV102Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV103Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV109Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV108Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV111Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV112Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV113Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV114Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV116Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV120Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV130Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV131Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           A10103HreDti ,
                                           A10104HreDtf ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV75Fec1 ,
                                           AV76Fec2 ,
                                           A9808HreRacab ,
                                           AV71HreRacab ,
                                           Integer.valueOf(AV84Clicod1) ,
                                           Integer.valueOf(AV85Clicod3) ,
                                           AV78ARtcod1 ,
                                           AV79ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV88TipArtCod1) ,
                                           Short.valueOf(AV89TipArtCod3) ,
                                           AV80Barcolnom1 ,
                                           AV81Barcolnom3 ,
                                           Integer.valueOf(AV82Barcolnum1) ,
                                           Integer.valueOf(AV83Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV90Tipcolcod1) ,
                                           Byte.valueOf(AV91Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV86Intcod1) ,
                                           Byte.valueOf(AV87Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV72barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV73barcodreo) ,
                                           A4494HreBarPar ,
                                           AV74barcodpar ,
                                           AV70Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV114Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV114Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV116Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV116Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV118Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV120Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV120Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV122Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV126Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV128Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L12 */
      pr_default.execute(0, new Object[] {AV70Emprcod, AV75Fec1, AV76Fec2, Integer.valueOf(AV84Clicod1), Integer.valueOf(AV85Clicod3), AV78ARtcod1, AV79ARtcod3, Short.valueOf(AV88TipArtCod1), Short.valueOf(AV89TipArtCod3), AV80Barcolnom1, AV81Barcolnom3, Integer.valueOf(AV82Barcolnum1), Integer.valueOf(AV83Barcolnum3), Byte.valueOf(AV90Tipcolcod1), Byte.valueOf(AV91Tipcolcod3), Byte.valueOf(AV86Intcod1), Byte.valueOf(AV87Intcod3), Integer.valueOf(AV72barcod), Integer.valueOf(AV72barcod), Byte.valueOf(AV73barcodreo), Byte.valueOf(AV73barcodreo), AV74barcodpar, AV74barcodpar, AV103Wcwanalisiscostesquimicossds_2_tfhrefectin, AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV112Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV113Wcwanalisiscostesquimicossds_12_tfclicod_to), lV114Wcwanalisiscostesquimicossds_13_tfclinom, AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV116Wcwanalisiscostesquimicossds_15_tfhrebarser, AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV118Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV120Wcwanalisiscostesquimicossds_19_tfhretipartd, AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV122Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV126Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV128Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P08L12_A4495HreNumCie[0] ;
         A4494HreBarPar = P08L12_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L12_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L12_A4492HreBarCod[0] ;
         A396EmprCod = P08L12_A396EmprCod[0] ;
         A4539HreIntCod = P08L12_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L12_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L12_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L12_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L12_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L12_n4519HreTipArt[0] ;
         A9808HreRacab = P08L12_A9808HreRacab[0] ;
         n9808HreRacab = P08L12_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L12_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L12_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L12_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L12_n4526HreTipColN[0] ;
         A4522HreColNum = P08L12_A4522HreColNum[0] ;
         n4522HreColNum = P08L12_n4522HreColNum[0] ;
         A4521HreColNom = P08L12_A4521HreColNom[0] ;
         n4521HreColNom = P08L12_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L12_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L12_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L12_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L12_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L12_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L12_n4517HreBarSer[0] ;
         A279CliNom = P08L12_A279CliNom[0] ;
         A252CliCod = P08L12_A252CliCod[0] ;
         n252CliCod = P08L12_n252CliCod[0] ;
         A4542HreTotKgm = P08L12_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L12_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L12_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L12_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L12_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L12_n4529HreFecTin[0] ;
         A4516HreDisCli = P08L12_A4516HreDisCli[0] ;
         n4516HreDisCli = P08L12_n4516HreDisCli[0] ;
         A11318HreDispCli = P08L12_A11318HreDispCli[0] ;
         n11318HreDispCli = P08L12_n11318HreDispCli[0] ;
         A279CliNom = P08L12_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV71HreRacab) == 0 ) || ( GXutil.strcmp(AV71HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
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
            AV30VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A4529HreFecTin );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV21ToA = ((GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "A", "") : httpContext.getMessage( "T", "")) ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21ToA, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV36Hdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36Hdr, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV37BarAgrEst = httpContext.getMessage( "N", "") ;
               if ( GXutil.strcmp(AV21ToA, httpContext.getMessage( "T", "")) == 0 )
               {
                  /* Using cursor P08L13 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A4497HreAgrCod = P08L13_A4497HreAgrCod[0] ;
                     A4498HreAgrReo = P08L13_A4498HreAgrReo[0] ;
                     A4499HreAgrPar = P08L13_A4499HreAgrPar[0] ;
                     AV37BarAgrEst = httpContext.getMessage( "S", "") ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
               else
               {
                  /* Using cursor P08L14 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A9985HreAcCod = P08L14_A9985HreAcCod[0] ;
                     A9986HreAcReo = P08L14_A9986HreAcReo[0] ;
                     A9987HreAcPar = P08L14_A9987HreAcPar[0] ;
                     AV37BarAgrEst = httpContext.getMessage( "S", "") ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
               }
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37BarAgrEst, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4532HreBarKgm)) );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4542HreTotKgm)) );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4546HreMaqCod, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A4547HreVolPrd );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV47Rb = ((A4542HreTotKgm.doubleValue()>0)&&(GXutil.strcmp(AV21ToA, httpContext.getMessage( "T", ""))==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47Rb)) );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV134Costet = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
               AV48Costei = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
               AV135Dif = AV48Costei.subtract(AV134Costet) ;
               AV136Porc = ((AV48Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV135Dif.divide(AV48Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48Costei)) );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV49CosteK = ((A4532HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV134Costet.divide(A4532HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49CosteK)) );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4517HreBarSer, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4518HreBarDsc, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4520HreTipArtD, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4521HreColNom, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A4522HreColNum );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4526HreTipColN, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4540HreIntDsc, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( GXutil.strcmp(AV21ToA, httpContext.getMessage( "T", "")) != 0 )
               {
                  /* Using cursor P08L15 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A4551HreProCod = P08L15_A4551HreProCod[0] ;
                     A4552HreProDsc = P08L15_A4552HreProDsc[0] ;
                     A4545HreLinMaq = P08L15_A4545HreLinMaq[0] ;
                     A4550HreLinPro = P08L15_A4550HreLinPro[0] ;
                     AV66HreProCod = A4551HreProCod ;
                     AV138Hreprodsc = A4552HreProDsc ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
               }
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66HreProCod, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( GXutil.strcmp(AV37BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( GXutil.strcmp(AV21ToA, httpContext.getMessage( "T", "")) == 0 )
                  {
                     AV69TablaA = (byte)(0) ;
                     /* Using cursor P08L16 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A4497HreAgrCod = P08L16_A4497HreAgrCod[0] ;
                        A4498HreAgrReo = P08L16_A4498HreAgrReo[0] ;
                        A4499HreAgrPar = P08L16_A4499HreAgrPar[0] ;
                        AV69TablaA = (byte)(1) ;
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                  }
                  if ( GXutil.strcmp(AV21ToA, httpContext.getMessage( "A", "")) == 0 )
                  {
                     AV69TablaA = (byte)(0) ;
                     /* Using cursor P08L17 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                     while ( (pr_default.getStatus(5) != 101) )
                     {
                        A9985HreAcCod = P08L17_A9985HreAcCod[0] ;
                        A9986HreAcReo = P08L17_A9986HreAcReo[0] ;
                        A9987HreAcPar = P08L17_A9987HreAcPar[0] ;
                        AV69TablaA = (byte)(1) ;
                        pr_default.readNext(5);
                     }
                     pr_default.close(5);
                  }
               }
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV69TablaA );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( A10103HreDti );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( A10104HreDtf );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV92BarEncCli = ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92BarEncCli, GXv_char5) ;
               wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreFecTin", "", "Fecha Cierre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ToA", "", "", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Hdr", "", "N Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAgrEst", "", "Agr?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreBarKgm", "", "Kilos", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreTotKgm", "", "Kilos Tot", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreMaqCod", "", "Maquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreVolPrd", "", "Volumen", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Rb", "", "Rb", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Costei", "", "Coste I", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CosteT", "", "Coste T", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Dif", "", "Dif", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Porc", "", "%", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CosteK", "", "Coste kg", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreBarSer", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreBarDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreTipArtD", "", "Tipo articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreColNom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreColNum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreTipColN", "", "TC", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreIntDsc", "", "Intensidad", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&HreProCod", "", "Proceso", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&HreProDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&TablaA", "", "", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreDti", "", "Inicio", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HreDtf", "", "Fin", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossColumnsSelector", GXv_char5) ;
      wcwanalisiscostesquimicossexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("WCWAnalisisCostesQuimicossGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      AV38OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV16OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV141GXV2 = 1 ;
      while ( AV141GXV2 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV2));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV97FilterFullText = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFECTIN") == 0 )
         {
            AV33TFHreFecTin = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARKGM") == 0 )
         {
            AV39TFHreBarKgm = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFHreBarKgm_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETOTKGM") == 0 )
         {
            AV41TFHreTotKgm = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFHreTotKgm_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV43TFHreMaqCod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV44TFHreMaqCod_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV45TFHreVolPrd = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFHreVolPrd_To = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV50TFCliCod = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFCliCod_To = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV52TFCliNom = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV53TFCliNom_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER") == 0 )
         {
            AV54TFHreBarSer = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER_SEL") == 0 )
         {
            AV55TFHreBarSer_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC") == 0 )
         {
            AV56TFHreBarDsc = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC_SEL") == 0 )
         {
            AV57TFHreBarDsc_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD") == 0 )
         {
            AV58TFHreTipArtD = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD_SEL") == 0 )
         {
            AV59TFHreTipArtD_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM") == 0 )
         {
            AV60TFHreColNom = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM_SEL") == 0 )
         {
            AV61TFHreColNom_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNUM") == 0 )
         {
            AV62TFHreColNum = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFHreColNum_To = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN") == 0 )
         {
            AV64TFHreTipColN = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN_SEL") == 0 )
         {
            AV65TFHreTipColN_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC") == 0 )
         {
            AV67TFHreIntDsc = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC_SEL") == 0 )
         {
            AV68TFHreIntDsc_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTI") == 0 )
         {
            AV93TFHreDti = localUtil.ctot( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTF") == 0 )
         {
            AV95TFHreDtf = localUtil.ctot( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV70Emprcod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV71HreRacab = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV75Fec1 = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV76Fec2 = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CALCULO") == 0 )
         {
            AV77Calculo = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV72barcod = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV73barcodreo = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV74barcodpar = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD1") == 0 )
         {
            AV78ARtcod1 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD3") == 0 )
         {
            AV79ARtcod3 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM1") == 0 )
         {
            AV80Barcolnom1 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM3") == 0 )
         {
            AV81Barcolnom3 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM1") == 0 )
         {
            AV82Barcolnum1 = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM3") == 0 )
         {
            AV83Barcolnum3 = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD1") == 0 )
         {
            AV84Clicod1 = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD3") == 0 )
         {
            AV85Clicod3 = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD1") == 0 )
         {
            AV86Intcod1 = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD3") == 0 )
         {
            AV87Intcod3 = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV88TipArtCod1 = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD3") == 0 )
         {
            AV89TipArtCod3 = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD1") == 0 )
         {
            AV90Tipcolcod1 = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD3") == 0 )
         {
            AV91Tipcolcod3 = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV141GXV2 = (int)(AV141GXV2+1) ;
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
      this.aP0[0] = wcwanalisiscostesquimicossexport.this.AV11Filename;
      this.aP1[0] = wcwanalisiscostesquimicossexport.this.AV12ErrorMessage;
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
      AV97FilterFullText = "" ;
      AV33TFHreFecTin = GXutil.nullDate() ;
      AV39TFHreBarKgm = DecimalUtil.ZERO ;
      AV40TFHreBarKgm_To = DecimalUtil.ZERO ;
      AV41TFHreTotKgm = DecimalUtil.ZERO ;
      AV42TFHreTotKgm_To = DecimalUtil.ZERO ;
      AV44TFHreMaqCod_Sel = "" ;
      AV43TFHreMaqCod = "" ;
      AV53TFCliNom_Sel = "" ;
      AV52TFCliNom = "" ;
      AV55TFHreBarSer_Sel = "" ;
      AV54TFHreBarSer = "" ;
      AV57TFHreBarDsc_Sel = "" ;
      AV56TFHreBarDsc = "" ;
      AV59TFHreTipArtD_Sel = "" ;
      AV58TFHreTipArtD = "" ;
      AV61TFHreColNom_Sel = "" ;
      AV60TFHreColNom = "" ;
      AV65TFHreTipColN_Sel = "" ;
      AV64TFHreTipColN = "" ;
      AV68TFHreIntDsc_Sel = "" ;
      AV67TFHreIntDsc = "" ;
      AV93TFHreDti = GXutil.resetTime( GXutil.nullDate() );
      AV95TFHreDtf = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV17Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4529HreFecTin = GXutil.nullDate() ;
      A9808HreRacab = "" ;
      A4494HreBarPar = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4521HreColNom = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A11318HreDispCli = "" ;
      A4516HreDisCli = "" ;
      AV102Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      AV103Wcwanalisiscostesquimicossds_2_tfhrefectin = GXutil.nullDate() ;
      AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm = DecimalUtil.ZERO ;
      AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = DecimalUtil.ZERO ;
      AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm = DecimalUtil.ZERO ;
      AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = DecimalUtil.ZERO ;
      AV108Wcwanalisiscostesquimicossds_7_tfhremaqcod = "" ;
      AV109Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = "" ;
      AV114Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel = "" ;
      AV116Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = "" ;
      AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = "" ;
      AV120Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = "" ;
      AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = "" ;
      AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = "" ;
      AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = "" ;
      AV130Wcwanalisiscostesquimicossds_29_tfhredti = GXutil.resetTime( GXutil.nullDate() );
      AV131Wcwanalisiscostesquimicossds_30_tfhredtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV102Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      lV114Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      lV116Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      lV118Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      lV120Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      lV122Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      lV126Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      lV128Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV75Fec1 = GXutil.nullDate() ;
      AV76Fec2 = GXutil.nullDate() ;
      AV71HreRacab = "" ;
      AV78ARtcod1 = "" ;
      AV79ARtcod3 = "" ;
      AV80Barcolnom1 = "" ;
      AV81Barcolnom3 = "" ;
      AV74barcodpar = "" ;
      AV70Emprcod = "" ;
      A396EmprCod = "" ;
      P08L12_A4495HreNumCie = new byte[1] ;
      P08L12_A4494HreBarPar = new String[] {""} ;
      P08L12_A4493HreBarReo = new byte[1] ;
      P08L12_A4492HreBarCod = new int[1] ;
      P08L12_A396EmprCod = new String[] {""} ;
      P08L12_A4539HreIntCod = new byte[1] ;
      P08L12_n4539HreIntCod = new boolean[] {false} ;
      P08L12_A4525HreTipCol = new byte[1] ;
      P08L12_n4525HreTipCol = new boolean[] {false} ;
      P08L12_A4519HreTipArt = new short[1] ;
      P08L12_n4519HreTipArt = new boolean[] {false} ;
      P08L12_A9808HreRacab = new String[] {""} ;
      P08L12_n9808HreRacab = new boolean[] {false} ;
      P08L12_A4540HreIntDsc = new String[] {""} ;
      P08L12_n4540HreIntDsc = new boolean[] {false} ;
      P08L12_A4526HreTipColN = new String[] {""} ;
      P08L12_n4526HreTipColN = new boolean[] {false} ;
      P08L12_A4522HreColNum = new int[1] ;
      P08L12_n4522HreColNum = new boolean[] {false} ;
      P08L12_A4521HreColNom = new String[] {""} ;
      P08L12_n4521HreColNom = new boolean[] {false} ;
      P08L12_A4520HreTipArtD = new String[] {""} ;
      P08L12_n4520HreTipArtD = new boolean[] {false} ;
      P08L12_A4518HreBarDsc = new String[] {""} ;
      P08L12_n4518HreBarDsc = new boolean[] {false} ;
      P08L12_A4517HreBarSer = new String[] {""} ;
      P08L12_n4517HreBarSer = new boolean[] {false} ;
      P08L12_A279CliNom = new String[] {""} ;
      P08L12_A252CliCod = new int[1] ;
      P08L12_n252CliCod = new boolean[] {false} ;
      P08L12_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L12_n4542HreTotKgm = new boolean[] {false} ;
      P08L12_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L12_n4532HreBarKgm = new boolean[] {false} ;
      P08L12_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L12_n4529HreFecTin = new boolean[] {false} ;
      P08L12_A4516HreDisCli = new String[] {""} ;
      P08L12_n4516HreDisCli = new boolean[] {false} ;
      P08L12_A11318HreDispCli = new String[] {""} ;
      P08L12_n11318HreDispCli = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV21ToA = "" ;
      AV36Hdr = "" ;
      AV37BarAgrEst = "" ;
      P08L13_A396EmprCod = new String[] {""} ;
      P08L13_A4492HreBarCod = new int[1] ;
      P08L13_A4493HreBarReo = new byte[1] ;
      P08L13_A4494HreBarPar = new String[] {""} ;
      P08L13_A4495HreNumCie = new byte[1] ;
      P08L13_A4497HreAgrCod = new int[1] ;
      P08L13_A4498HreAgrReo = new byte[1] ;
      P08L13_A4499HreAgrPar = new String[] {""} ;
      A4499HreAgrPar = "" ;
      P08L14_A396EmprCod = new String[] {""} ;
      P08L14_A4492HreBarCod = new int[1] ;
      P08L14_A4493HreBarReo = new byte[1] ;
      P08L14_A4494HreBarPar = new String[] {""} ;
      P08L14_A4495HreNumCie = new byte[1] ;
      P08L14_A9985HreAcCod = new int[1] ;
      P08L14_A9986HreAcReo = new byte[1] ;
      P08L14_A9987HreAcPar = new String[] {""} ;
      A9987HreAcPar = "" ;
      AV47Rb = DecimalUtil.ZERO ;
      AV134Costet = DecimalUtil.ZERO ;
      AV48Costei = DecimalUtil.ZERO ;
      AV135Dif = DecimalUtil.ZERO ;
      AV136Porc = DecimalUtil.ZERO ;
      AV49CosteK = DecimalUtil.ZERO ;
      P08L15_A396EmprCod = new String[] {""} ;
      P08L15_A4492HreBarCod = new int[1] ;
      P08L15_A4493HreBarReo = new byte[1] ;
      P08L15_A4494HreBarPar = new String[] {""} ;
      P08L15_A4495HreNumCie = new byte[1] ;
      P08L15_A4551HreProCod = new String[] {""} ;
      P08L15_A4552HreProDsc = new String[] {""} ;
      P08L15_A4545HreLinMaq = new short[1] ;
      P08L15_A4550HreLinPro = new byte[1] ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV66HreProCod = "" ;
      AV138Hreprodsc = "" ;
      P08L16_A396EmprCod = new String[] {""} ;
      P08L16_A4492HreBarCod = new int[1] ;
      P08L16_A4493HreBarReo = new byte[1] ;
      P08L16_A4494HreBarPar = new String[] {""} ;
      P08L16_A4495HreNumCie = new byte[1] ;
      P08L16_A4497HreAgrCod = new int[1] ;
      P08L16_A4498HreAgrReo = new byte[1] ;
      P08L16_A4499HreAgrPar = new String[] {""} ;
      P08L17_A396EmprCod = new String[] {""} ;
      P08L17_A4492HreBarCod = new int[1] ;
      P08L17_A4493HreBarReo = new byte[1] ;
      P08L17_A4494HreBarPar = new String[] {""} ;
      P08L17_A4495HreNumCie = new byte[1] ;
      P08L17_A9985HreAcCod = new int[1] ;
      P08L17_A9986HreAcReo = new byte[1] ;
      P08L17_A9987HreAcPar = new String[] {""} ;
      AV92BarEncCli = "" ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwanalisiscostesquimicossexport__default(),
         new Object[] {
             new Object[] {
            P08L12_A4495HreNumCie, P08L12_A4494HreBarPar, P08L12_A4493HreBarReo, P08L12_A4492HreBarCod, P08L12_A396EmprCod, P08L12_A4539HreIntCod, P08L12_n4539HreIntCod, P08L12_A4525HreTipCol, P08L12_n4525HreTipCol, P08L12_A4519HreTipArt,
            P08L12_n4519HreTipArt, P08L12_A9808HreRacab, P08L12_n9808HreRacab, P08L12_A4540HreIntDsc, P08L12_n4540HreIntDsc, P08L12_A4526HreTipColN, P08L12_n4526HreTipColN, P08L12_A4522HreColNum, P08L12_n4522HreColNum, P08L12_A4521HreColNom,
            P08L12_n4521HreColNom, P08L12_A4520HreTipArtD, P08L12_n4520HreTipArtD, P08L12_A4518HreBarDsc, P08L12_n4518HreBarDsc, P08L12_A4517HreBarSer, P08L12_n4517HreBarSer, P08L12_A279CliNom, P08L12_A252CliCod, P08L12_n252CliCod,
            P08L12_A4542HreTotKgm, P08L12_n4542HreTotKgm, P08L12_A4532HreBarKgm, P08L12_n4532HreBarKgm, P08L12_A4529HreFecTin, P08L12_n4529HreFecTin, P08L12_A4516HreDisCli, P08L12_n4516HreDisCli, P08L12_A11318HreDispCli, P08L12_n11318HreDispCli
            }
            , new Object[] {
            P08L13_A396EmprCod, P08L13_A4492HreBarCod, P08L13_A4493HreBarReo, P08L13_A4494HreBarPar, P08L13_A4495HreNumCie, P08L13_A4497HreAgrCod, P08L13_A4498HreAgrReo, P08L13_A4499HreAgrPar
            }
            , new Object[] {
            P08L14_A396EmprCod, P08L14_A4492HreBarCod, P08L14_A4493HreBarReo, P08L14_A4494HreBarPar, P08L14_A4495HreNumCie, P08L14_A9985HreAcCod, P08L14_A9986HreAcReo, P08L14_A9987HreAcPar
            }
            , new Object[] {
            P08L15_A396EmprCod, P08L15_A4492HreBarCod, P08L15_A4493HreBarReo, P08L15_A4494HreBarPar, P08L15_A4495HreNumCie, P08L15_A4551HreProCod, P08L15_A4552HreProDsc, P08L15_A4545HreLinMaq, P08L15_A4550HreLinPro
            }
            , new Object[] {
            P08L16_A396EmprCod, P08L16_A4492HreBarCod, P08L16_A4493HreBarReo, P08L16_A4494HreBarPar, P08L16_A4495HreNumCie, P08L16_A4497HreAgrCod, P08L16_A4498HreAgrReo, P08L16_A4499HreAgrPar
            }
            , new Object[] {
            P08L17_A396EmprCod, P08L17_A4492HreBarCod, P08L17_A4493HreBarReo, P08L17_A4494HreBarPar, P08L17_A4495HreNumCie, P08L17_A9985HreAcCod, P08L17_A9986HreAcReo, P08L17_A9987HreAcPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte AV90Tipcolcod1 ;
   private byte AV91Tipcolcod3 ;
   private byte A4539HreIntCod ;
   private byte AV86Intcod1 ;
   private byte AV87Intcod3 ;
   private byte AV73barcodreo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A4550HreLinPro ;
   private byte AV69TablaA ;
   private byte AV77Calculo ;
   private short GXv_int3[] ;
   private short AV38OrderedBy ;
   private short A4519HreTipArt ;
   private short AV88TipArtCod1 ;
   private short AV89TipArtCod3 ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45TFHreVolPrd ;
   private int AV46TFHreVolPrd_To ;
   private int AV50TFCliCod ;
   private int AV51TFCliCod_To ;
   private int AV62TFHreColNum ;
   private int AV63TFHreColNum_To ;
   private int AV100GXV1 ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int AV110Wcwanalisiscostesquimicossds_9_tfhrevolprd ;
   private int AV111Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ;
   private int AV112Wcwanalisiscostesquimicossds_11_tfclicod ;
   private int AV113Wcwanalisiscostesquimicossds_12_tfclicod_to ;
   private int AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum ;
   private int AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ;
   private int AV84Clicod1 ;
   private int AV85Clicod3 ;
   private int AV82Barcolnum1 ;
   private int AV83Barcolnum3 ;
   private int AV72barcod ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private int AV141GXV2 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV39TFHreBarKgm ;
   private java.math.BigDecimal AV40TFHreBarKgm_To ;
   private java.math.BigDecimal AV41TFHreTotKgm ;
   private java.math.BigDecimal AV42TFHreTotKgm_To ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm ;
   private java.math.BigDecimal AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ;
   private java.math.BigDecimal AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm ;
   private java.math.BigDecimal AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ;
   private java.math.BigDecimal AV47Rb ;
   private java.math.BigDecimal AV134Costet ;
   private java.math.BigDecimal AV48Costei ;
   private java.math.BigDecimal AV135Dif ;
   private java.math.BigDecimal AV136Porc ;
   private java.math.BigDecimal AV49CosteK ;
   private String AV44TFHreMaqCod_Sel ;
   private String AV43TFHreMaqCod ;
   private String AV53TFCliNom_Sel ;
   private String AV52TFCliNom ;
   private String AV55TFHreBarSer_Sel ;
   private String AV54TFHreBarSer ;
   private String AV57TFHreBarDsc_Sel ;
   private String AV56TFHreBarDsc ;
   private String AV59TFHreTipArtD_Sel ;
   private String AV58TFHreTipArtD ;
   private String AV61TFHreColNom_Sel ;
   private String AV60TFHreColNom ;
   private String AV65TFHreTipColN_Sel ;
   private String AV64TFHreTipColN ;
   private String AV68TFHreIntDsc_Sel ;
   private String AV67TFHreIntDsc ;
   private String A9808HreRacab ;
   private String A4494HreBarPar ;
   private String A4546HreMaqCod ;
   private String A279CliNom ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4521HreColNom ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A11318HreDispCli ;
   private String A4516HreDisCli ;
   private String AV108Wcwanalisiscostesquimicossds_7_tfhremaqcod ;
   private String AV109Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ;
   private String AV114Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel ;
   private String AV116Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ;
   private String AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ;
   private String AV120Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ;
   private String AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ;
   private String AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ;
   private String AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ;
   private String scmdbuf ;
   private String lV114Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String lV116Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String lV118Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String lV120Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String lV122Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String lV126Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String lV128Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV71HreRacab ;
   private String AV78ARtcod1 ;
   private String AV79ARtcod3 ;
   private String AV80Barcolnom1 ;
   private String AV81Barcolnom3 ;
   private String AV74barcodpar ;
   private String AV70Emprcod ;
   private String A396EmprCod ;
   private String AV21ToA ;
   private String AV36Hdr ;
   private String AV37BarAgrEst ;
   private String A4499HreAgrPar ;
   private String A9987HreAcPar ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV66HreProCod ;
   private String AV138Hreprodsc ;
   private String AV92BarEncCli ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV93TFHreDti ;
   private java.util.Date AV95TFHreDtf ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date AV130Wcwanalisiscostesquimicossds_29_tfhredti ;
   private java.util.Date AV131Wcwanalisiscostesquimicossds_30_tfhredtf ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV33TFHreFecTin ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV103Wcwanalisiscostesquimicossds_2_tfhrefectin ;
   private java.util.Date AV75Fec1 ;
   private java.util.Date AV76Fec2 ;
   private boolean returnInSub ;
   private boolean AV16OrderedDsc ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4519HreTipArt ;
   private boolean n9808HreRacab ;
   private boolean n4540HreIntDsc ;
   private boolean n4526HreTipColN ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4520HreTipArtD ;
   private boolean n4518HreBarDsc ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n4542HreTotKgm ;
   private boolean n4532HreBarKgm ;
   private boolean n4529HreFecTin ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV97FilterFullText ;
   private String AV102Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String lV102Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08L12_A4495HreNumCie ;
   private String[] P08L12_A4494HreBarPar ;
   private byte[] P08L12_A4493HreBarReo ;
   private int[] P08L12_A4492HreBarCod ;
   private String[] P08L12_A396EmprCod ;
   private byte[] P08L12_A4539HreIntCod ;
   private boolean[] P08L12_n4539HreIntCod ;
   private byte[] P08L12_A4525HreTipCol ;
   private boolean[] P08L12_n4525HreTipCol ;
   private short[] P08L12_A4519HreTipArt ;
   private boolean[] P08L12_n4519HreTipArt ;
   private String[] P08L12_A9808HreRacab ;
   private boolean[] P08L12_n9808HreRacab ;
   private String[] P08L12_A4540HreIntDsc ;
   private boolean[] P08L12_n4540HreIntDsc ;
   private String[] P08L12_A4526HreTipColN ;
   private boolean[] P08L12_n4526HreTipColN ;
   private int[] P08L12_A4522HreColNum ;
   private boolean[] P08L12_n4522HreColNum ;
   private String[] P08L12_A4521HreColNom ;
   private boolean[] P08L12_n4521HreColNom ;
   private String[] P08L12_A4520HreTipArtD ;
   private boolean[] P08L12_n4520HreTipArtD ;
   private String[] P08L12_A4518HreBarDsc ;
   private boolean[] P08L12_n4518HreBarDsc ;
   private String[] P08L12_A4517HreBarSer ;
   private boolean[] P08L12_n4517HreBarSer ;
   private String[] P08L12_A279CliNom ;
   private int[] P08L12_A252CliCod ;
   private boolean[] P08L12_n252CliCod ;
   private java.math.BigDecimal[] P08L12_A4542HreTotKgm ;
   private boolean[] P08L12_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L12_A4532HreBarKgm ;
   private boolean[] P08L12_n4532HreBarKgm ;
   private java.util.Date[] P08L12_A4529HreFecTin ;
   private boolean[] P08L12_n4529HreFecTin ;
   private String[] P08L12_A4516HreDisCli ;
   private boolean[] P08L12_n4516HreDisCli ;
   private String[] P08L12_A11318HreDispCli ;
   private boolean[] P08L12_n11318HreDispCli ;
   private String[] P08L13_A396EmprCod ;
   private int[] P08L13_A4492HreBarCod ;
   private byte[] P08L13_A4493HreBarReo ;
   private String[] P08L13_A4494HreBarPar ;
   private byte[] P08L13_A4495HreNumCie ;
   private int[] P08L13_A4497HreAgrCod ;
   private byte[] P08L13_A4498HreAgrReo ;
   private String[] P08L13_A4499HreAgrPar ;
   private String[] P08L14_A396EmprCod ;
   private int[] P08L14_A4492HreBarCod ;
   private byte[] P08L14_A4493HreBarReo ;
   private String[] P08L14_A4494HreBarPar ;
   private byte[] P08L14_A4495HreNumCie ;
   private int[] P08L14_A9985HreAcCod ;
   private byte[] P08L14_A9986HreAcReo ;
   private String[] P08L14_A9987HreAcPar ;
   private String[] P08L15_A396EmprCod ;
   private int[] P08L15_A4492HreBarCod ;
   private byte[] P08L15_A4493HreBarReo ;
   private String[] P08L15_A4494HreBarPar ;
   private byte[] P08L15_A4495HreNumCie ;
   private String[] P08L15_A4551HreProCod ;
   private String[] P08L15_A4552HreProDsc ;
   private short[] P08L15_A4545HreLinMaq ;
   private byte[] P08L15_A4550HreLinPro ;
   private String[] P08L16_A396EmprCod ;
   private int[] P08L16_A4492HreBarCod ;
   private byte[] P08L16_A4493HreBarReo ;
   private String[] P08L16_A4494HreBarPar ;
   private byte[] P08L16_A4495HreNumCie ;
   private int[] P08L16_A4497HreAgrCod ;
   private byte[] P08L16_A4498HreAgrReo ;
   private String[] P08L16_A4499HreAgrPar ;
   private String[] P08L17_A396EmprCod ;
   private int[] P08L17_A4492HreBarCod ;
   private byte[] P08L17_A4493HreBarReo ;
   private String[] P08L17_A4494HreBarPar ;
   private byte[] P08L17_A4495HreNumCie ;
   private int[] P08L17_A9985HreAcCod ;
   private byte[] P08L17_A9986HreAcReo ;
   private String[] P08L17_A9987HreAcPar ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class wcwanalisiscostesquimicossexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV103Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV109Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV108Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV110Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV111Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV112Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV113Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV114Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV116Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV120Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV130Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV131Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date A10103HreDti ,
                                          java.util.Date A10104HreDtf ,
                                          short AV38OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          java.util.Date AV75Fec1 ,
                                          java.util.Date AV76Fec2 ,
                                          String A9808HreRacab ,
                                          String AV71HreRacab ,
                                          int AV84Clicod1 ,
                                          int AV85Clicod3 ,
                                          String AV78ARtcod1 ,
                                          String AV79ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV88TipArtCod1 ,
                                          short AV89TipArtCod3 ,
                                          String AV80Barcolnom1 ,
                                          String AV81Barcolnom3 ,
                                          int AV82Barcolnum1 ,
                                          int AV83Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV90Tipcolcod1 ,
                                          byte AV91Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV86Intcod1 ,
                                          byte AV87Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV72barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV73barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV74barcodpar ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[46];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreDisCli, T1.HreDispCli FROM (TXPHISREH" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV112Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV113Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV120Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV122Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV124Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV125Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV126Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV38OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreFecTin" ;
      }
      else if ( ( AV38OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreFecTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarSer" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarSer DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNom" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNum" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNum DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipColN" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipColN DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08L12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L13", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L14", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L15", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCod, HreProDsc, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L16", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L17", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

