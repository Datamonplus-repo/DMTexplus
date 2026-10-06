package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwwkp89export extends GXProcedure
{
   public wcwwkp89export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwwkp89export.class ), "" );
   }

   public wcwwkp89export( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcwwkp89export.this.aP1 = new String[] {""};
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
      wcwwkp89export.this.aP0 = aP0;
      wcwwkp89export.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCWWkp89Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNum_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNom_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNom, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFTipPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Familia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFTipPrdDsc_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFTipPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Familia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFTipPrdDsc, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFPrdRefPrv_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Uso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdRefPrv_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFPrdRefPrv)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Uso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrdRefPrv, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPrdUbicacion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ubicacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdUbicacion_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPrdUbicacion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ubicacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdUbicacion, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdStkMinU)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdStkMinU_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Stock Minimo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFPrdStkMinU)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFPrdStkMinU_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFPrdPreAct_To)) );
      }
      if ( ! ( (0==AV59TFPrvNum) && (0==AV60TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV62TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFPrvNom_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFPrvNom, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFPrdLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFPrdLote_Sel, GXv_char5) ;
         wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFPrdLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFPrdLote, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV69TFValCod) && (0==AV70TFValCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFValCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwwkp89export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFValCod_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWWkp89ColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("WCWWkp89ColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV73GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Wcwwkp89ds_1_filterfulltext = AV18FilterFullText ;
      AV76Wcwwkp89ds_2_tfprdnum = AV34TFPrdNum ;
      AV77Wcwwkp89ds_3_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV78Wcwwkp89ds_4_tfprdnom = AV36TFPrdNom ;
      AV79Wcwwkp89ds_5_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV80Wcwwkp89ds_6_tftipprddsc = AV38TFTipPrdDsc ;
      AV81Wcwwkp89ds_7_tftipprddsc_sel = AV39TFTipPrdDsc_Sel ;
      AV82Wcwwkp89ds_8_tfprdrefprv = AV40TFPrdRefPrv ;
      AV83Wcwwkp89ds_9_tfprdrefprv_sel = AV41TFPrdRefPrv_Sel ;
      AV84Wcwwkp89ds_10_tfprdubicacion = AV42TFPrdUbicacion ;
      AV85Wcwwkp89ds_11_tfprdubicacion_sel = AV43TFPrdUbicacion_Sel ;
      AV86Wcwwkp89ds_12_tfprdstkminu = AV44TFPrdStkMinU ;
      AV87Wcwwkp89ds_13_tfprdstkminu_to = AV45TFPrdStkMinU_To ;
      AV88Wcwwkp89ds_14_tfprdpreact = AV57TFPrdPreAct ;
      AV89Wcwwkp89ds_15_tfprdpreact_to = AV58TFPrdPreAct_To ;
      AV90Wcwwkp89ds_16_tfprvnum = AV59TFPrvNum ;
      AV91Wcwwkp89ds_17_tfprvnum_to = AV60TFPrvNum_To ;
      AV92Wcwwkp89ds_18_tfprvnom = AV61TFPrvNom ;
      AV93Wcwwkp89ds_19_tfprvnom_sel = AV62TFPrvNom_Sel ;
      AV94Wcwwkp89ds_20_tfprdlote = AV65TFPrdLote ;
      AV95Wcwwkp89ds_21_tfprdlote_sel = AV66TFPrdLote_Sel ;
      AV96Wcwwkp89ds_22_tfvalcod = AV69TFValCod ;
      AV97Wcwwkp89ds_23_tfvalcod_to = AV70TFValCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Wcwwkp89ds_1_filterfulltext ,
                                           AV77Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV76Wcwwkp89ds_2_tfprdnum ,
                                           AV79Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV78Wcwwkp89ds_4_tfprdnom ,
                                           AV81Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV80Wcwwkp89ds_6_tftipprddsc ,
                                           AV83Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV82Wcwwkp89ds_8_tfprdrefprv ,
                                           AV85Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV84Wcwwkp89ds_10_tfprdubicacion ,
                                           AV86Wcwwkp89ds_12_tfprdstkminu ,
                                           AV87Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV88Wcwwkp89ds_14_tfprdpreact ,
                                           AV89Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV90Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV91Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV93Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV92Wcwwkp89ds_18_tfprvnom ,
                                           AV95Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV94Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV96Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV97Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV67ValCodfrom) ,
                                           Short.valueOf(AV68ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV47Emprcod ,
                                           AV48Prdnum ,
                                           A396EmprCod ,
                                           AV49Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV76Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV78Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV80Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV82Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV82Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV84Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV84Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV92Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV92Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV94Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV94Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08W82 */
      pr_default.execute(0, new Object[] {AV47Emprcod, AV48Prdnum, AV49Prdnum_to, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_2_tfprdnum, AV77Wcwwkp89ds_3_tfprdnum_sel, lV78Wcwwkp89ds_4_tfprdnom, AV79Wcwwkp89ds_5_tfprdnom_sel, lV80Wcwwkp89ds_6_tftipprddsc, AV81Wcwwkp89ds_7_tftipprddsc_sel, lV82Wcwwkp89ds_8_tfprdrefprv, AV83Wcwwkp89ds_9_tfprdrefprv_sel, lV84Wcwwkp89ds_10_tfprdubicacion, AV85Wcwwkp89ds_11_tfprdubicacion_sel, AV86Wcwwkp89ds_12_tfprdstkminu, AV87Wcwwkp89ds_13_tfprdstkminu_to, AV88Wcwwkp89ds_14_tfprdpreact, AV89Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV90Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV91Wcwwkp89ds_17_tfprvnum_to), lV92Wcwwkp89ds_18_tfprvnom, AV93Wcwwkp89ds_19_tfprvnom_sel, lV94Wcwwkp89ds_20_tfprdlote, AV95Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV96Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV97Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV67ValCodfrom), Short.valueOf(AV68ValCodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6301TipPrdCod = P08W82_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08W82_n6301TipPrdCod[0] ;
         A396EmprCod = P08W82_A396EmprCod[0] ;
         A856ValCod = P08W82_A856ValCod[0] ;
         A10881PrdLote = P08W82_A10881PrdLote[0] ;
         A794PrvNom = P08W82_A794PrvNom[0] ;
         n794PrvNom = P08W82_n794PrvNom[0] ;
         A795PrvNum = P08W82_A795PrvNum[0] ;
         A724PrdPreAct = P08W82_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08W82_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08W82_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08W82_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08W82_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08W82_n6302TipPrdDsc[0] ;
         A718PrdNom = P08W82_A718PrdNom[0] ;
         A719PrdNum = P08W82_A719PrdNum[0] ;
         A704PrdExiAlm = P08W82_A704PrdExiAlm[0] ;
         A685PrdCanRes = P08W82_A685PrdCanRes[0] ;
         A6302TipPrdDsc = P08W82_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08W82_n6302TipPrdDsc[0] ;
         A794PrvNom = P08W82_A794PrvNom[0] ;
         n794PrvNom = P08W82_n794PrvNom[0] ;
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
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6302TipPrdDsc, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A728PrdRefPrv, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13457PrdUbicaci, GXv_char5) ;
            wcwwkp89export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A732PrdStkMinU)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_char6[0] = A719PrdNum ;
            GXv_char7[0] = A719PrdNum ;
            GXv_decimal8[0] = AV50CantInv ;
            GXv_decimal9[0] = AV98Compras ;
            GXv_decimal10[0] = AV99Consumos ;
            GXv_decimal11[0] = AV100Compras2 ;
            GXv_decimal12[0] = AV101Consumos2 ;
            GXv_char13[0] = AV63obsp ;
            new app.pupq010(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_char13) ;
            wcwwkp89export.this.A396EmprCod = GXv_char5[0] ;
            wcwwkp89export.this.A719PrdNum = GXv_char6[0] ;
            wcwwkp89export.this.A719PrdNum = GXv_char7[0] ;
            wcwwkp89export.this.AV50CantInv = GXv_decimal8[0] ;
            wcwwkp89export.this.AV98Compras = GXv_decimal9[0] ;
            wcwwkp89export.this.AV99Consumos = GXv_decimal10[0] ;
            wcwwkp89export.this.AV100Compras2 = GXv_decimal11[0] ;
            wcwwkp89export.this.AV101Consumos2 = GXv_decimal12[0] ;
            wcwwkp89export.this.AV63obsp = GXv_char13[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50CantInv)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_char7[0] = A719PrdNum ;
            GXv_decimal12[0] = AV102Cantres ;
            GXv_decimal11[0] = AV103Cantpesada ;
            GXv_decimal10[0] = AV104Cantpdte ;
            GXv_char6[0] = AV64InciCPEDID ;
            new app.pprc175(remoteHandle, context).execute( GXv_char13, GXv_char7, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_char6) ;
            wcwwkp89export.this.A396EmprCod = GXv_char13[0] ;
            wcwwkp89export.this.A719PrdNum = GXv_char7[0] ;
            wcwwkp89export.this.AV102Cantres = GXv_decimal12[0] ;
            wcwwkp89export.this.AV103Cantpesada = GXv_decimal11[0] ;
            wcwwkp89export.this.AV104Cantpdte = GXv_decimal10[0] ;
            wcwwkp89export.this.AV64InciCPEDID = GXv_char6[0] ;
            AV51PrdExiAlm = A704PrdExiAlm.subtract(AV103Cantpesada) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51PrdExiAlm)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV53stockTotal = AV51PrdExiAlm.add(AV103Cantpesada) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53stockTotal)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV54PrdCanRes = A685PrdCanRes.subtract(AV103Cantpesada) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54PrdCanRes)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV55StockDisponible = A704PrdExiAlm.subtract(AV54PrdCanRes) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55StockDisponible)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56valor0 = (AV51PrdExiAlm.add(AV103Cantpesada)).multiply(A724PrdPreAct) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56valor0)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char13[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char13) ;
            wcwwkp89export.this.GXt_char4 = GXv_char13[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char13[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10881PrdLote, GXv_char13) ;
            wcwwkp89export.this.GXt_char4 = GXv_char13[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A856ValCod );
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
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipPrdDsc", "", "Familia", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdRefPrv", "", "Uso", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdUbicacion", "", "Ubicacion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdStkMinU", "", "Unidades Stock Minimo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CantInv", "", "Stock Inicial", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Compras", "", "Compras", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Consumos", "", "Consumos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PrdExiAlm", "", "Stock Piso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CantPesada", "", "Stock Pesado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&stockTotal", "", "Stock Total", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PrdCanRes", "", "Reservas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&StockDisponible", "", "Stock Disponible", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&valor0", "", "Valor Stock", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrvNum", "", "Codigo Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrvNom", "", "Nombre Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdLote", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ValCod", "", "Validez", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char13[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWWkp89ColumnsSelector", GXv_char13) ;
      wcwwkp89export.this.GXt_char4 = GXv_char13[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWWkp89GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWWkp89GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCWWkp89GridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV2 = 1 ;
      while ( AV105GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV38TFTipPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV39TFTipPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV40TFPrdRefPrv = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV41TFPrdRefPrv_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION") == 0 )
         {
            AV42TFPrdUbicacion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION_SEL") == 0 )
         {
            AV43TFPrdUbicacion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV44TFPrdStkMinU = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdStkMinU_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV57TFPrdPreAct = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFPrdPreAct_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV59TFPrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFPrvNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV61TFPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV62TFPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE") == 0 )
         {
            AV65TFPrdLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE_SEL") == 0 )
         {
            AV66TFPrdLote_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV69TFValCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFValCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV48Prdnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV49Prdnum_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODFROM") == 0 )
         {
            AV67ValCodfrom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODTO") == 0 )
         {
            AV68ValCodto = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SELECCION") == 0 )
         {
            AV52Seleccion = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV105GXV2 = (int)(AV105GXV2+1) ;
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
      this.aP0[0] = wcwwkp89export.this.AV11Filename;
      this.aP1[0] = wcwwkp89export.this.AV12ErrorMessage;
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
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV36TFPrdNom = "" ;
      AV39TFTipPrdDsc_Sel = "" ;
      AV38TFTipPrdDsc = "" ;
      AV41TFPrdRefPrv_Sel = "" ;
      AV40TFPrdRefPrv = "" ;
      AV43TFPrdUbicacion_Sel = "" ;
      AV42TFPrdUbicacion = "" ;
      AV44TFPrdStkMinU = DecimalUtil.ZERO ;
      AV45TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV57TFPrdPreAct = DecimalUtil.ZERO ;
      AV58TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV62TFPrvNom_Sel = "" ;
      AV61TFPrvNom = "" ;
      AV66TFPrdLote_Sel = "" ;
      AV65TFPrdLote = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A6302TipPrdDsc = "" ;
      A728PrdRefPrv = "" ;
      A13457PrdUbicaci = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A10881PrdLote = "" ;
      AV75Wcwwkp89ds_1_filterfulltext = "" ;
      AV76Wcwwkp89ds_2_tfprdnum = "" ;
      AV77Wcwwkp89ds_3_tfprdnum_sel = "" ;
      AV78Wcwwkp89ds_4_tfprdnom = "" ;
      AV79Wcwwkp89ds_5_tfprdnom_sel = "" ;
      AV80Wcwwkp89ds_6_tftipprddsc = "" ;
      AV81Wcwwkp89ds_7_tftipprddsc_sel = "" ;
      AV82Wcwwkp89ds_8_tfprdrefprv = "" ;
      AV83Wcwwkp89ds_9_tfprdrefprv_sel = "" ;
      AV84Wcwwkp89ds_10_tfprdubicacion = "" ;
      AV85Wcwwkp89ds_11_tfprdubicacion_sel = "" ;
      AV86Wcwwkp89ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV87Wcwwkp89ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV88Wcwwkp89ds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV89Wcwwkp89ds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV92Wcwwkp89ds_18_tfprvnom = "" ;
      AV93Wcwwkp89ds_19_tfprvnom_sel = "" ;
      AV94Wcwwkp89ds_20_tfprdlote = "" ;
      AV95Wcwwkp89ds_21_tfprdlote_sel = "" ;
      scmdbuf = "" ;
      lV75Wcwwkp89ds_1_filterfulltext = "" ;
      lV76Wcwwkp89ds_2_tfprdnum = "" ;
      lV78Wcwwkp89ds_4_tfprdnom = "" ;
      lV80Wcwwkp89ds_6_tftipprddsc = "" ;
      lV82Wcwwkp89ds_8_tfprdrefprv = "" ;
      lV84Wcwwkp89ds_10_tfprdubicacion = "" ;
      lV92Wcwwkp89ds_18_tfprvnom = "" ;
      lV94Wcwwkp89ds_20_tfprdlote = "" ;
      AV47Emprcod = "" ;
      AV48Prdnum = "" ;
      AV49Prdnum_to = "" ;
      P08W82_A6301TipPrdCod = new short[1] ;
      P08W82_n6301TipPrdCod = new boolean[] {false} ;
      P08W82_A396EmprCod = new String[] {""} ;
      P08W82_A856ValCod = new byte[1] ;
      P08W82_A10881PrdLote = new String[] {""} ;
      P08W82_A794PrvNom = new String[] {""} ;
      P08W82_n794PrvNom = new boolean[] {false} ;
      P08W82_A795PrvNum = new int[1] ;
      P08W82_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08W82_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08W82_A13457PrdUbicaci = new String[] {""} ;
      P08W82_A728PrdRefPrv = new String[] {""} ;
      P08W82_A6302TipPrdDsc = new String[] {""} ;
      P08W82_n6302TipPrdDsc = new boolean[] {false} ;
      P08W82_A718PrdNom = new String[] {""} ;
      P08W82_A719PrdNum = new String[] {""} ;
      P08W82_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08W82_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char5 = new String[1] ;
      AV50CantInv = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV98Compras = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV99Consumos = DecimalUtil.ZERO ;
      AV100Compras2 = DecimalUtil.ZERO ;
      AV101Consumos2 = DecimalUtil.ZERO ;
      AV63obsp = "" ;
      GXv_char7 = new String[1] ;
      AV102Cantres = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV103Cantpesada = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV104Cantpdte = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV64InciCPEDID = "" ;
      GXv_char6 = new String[1] ;
      AV51PrdExiAlm = DecimalUtil.ZERO ;
      AV53stockTotal = DecimalUtil.ZERO ;
      AV54PrdCanRes = DecimalUtil.ZERO ;
      AV55StockDisponible = DecimalUtil.ZERO ;
      AV56valor0 = DecimalUtil.ZERO ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char13 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp89export__default(),
         new Object[] {
             new Object[] {
            P08W82_A6301TipPrdCod, P08W82_n6301TipPrdCod, P08W82_A396EmprCod, P08W82_A856ValCod, P08W82_A10881PrdLote, P08W82_A794PrvNom, P08W82_n794PrvNom, P08W82_A795PrvNum, P08W82_A724PrdPreAct, P08W82_A732PrdStkMinU,
            P08W82_A13457PrdUbicaci, P08W82_A728PrdRefPrv, P08W82_A6302TipPrdDsc, P08W82_n6302TipPrdDsc, P08W82_A718PrdNom, P08W82_A719PrdNum, P08W82_A704PrdExiAlm, P08W82_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV69TFValCod ;
   private byte AV70TFValCod_To ;
   private byte A856ValCod ;
   private byte AV96Wcwwkp89ds_22_tfvalcod ;
   private byte AV97Wcwwkp89ds_23_tfvalcod_to ;
   private byte AV52Seleccion ;
   private short GXv_int3[] ;
   private short AV67ValCodfrom ;
   private short AV68ValCodto ;
   private short AV16OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV59TFPrvNum ;
   private int AV60TFPrvNum_To ;
   private int AV73GXV1 ;
   private int A795PrvNum ;
   private int AV90Wcwwkp89ds_16_tfprvnum ;
   private int AV91Wcwwkp89ds_17_tfprvnum_to ;
   private int AV105GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV44TFPrdStkMinU ;
   private java.math.BigDecimal AV45TFPrdStkMinU_To ;
   private java.math.BigDecimal AV57TFPrdPreAct ;
   private java.math.BigDecimal AV58TFPrdPreAct_To ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV86Wcwwkp89ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV87Wcwwkp89ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV88Wcwwkp89ds_14_tfprdpreact ;
   private java.math.BigDecimal AV89Wcwwkp89ds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV50CantInv ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV98Compras ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV99Consumos ;
   private java.math.BigDecimal AV100Compras2 ;
   private java.math.BigDecimal AV101Consumos2 ;
   private java.math.BigDecimal AV102Cantres ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV103Cantpesada ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV104Cantpdte ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV51PrdExiAlm ;
   private java.math.BigDecimal AV53stockTotal ;
   private java.math.BigDecimal AV54PrdCanRes ;
   private java.math.BigDecimal AV55StockDisponible ;
   private java.math.BigDecimal AV56valor0 ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV37TFPrdNom_Sel ;
   private String AV36TFPrdNom ;
   private String AV39TFTipPrdDsc_Sel ;
   private String AV38TFTipPrdDsc ;
   private String AV41TFPrdRefPrv_Sel ;
   private String AV40TFPrdRefPrv ;
   private String AV43TFPrdUbicacion_Sel ;
   private String AV42TFPrdUbicacion ;
   private String AV62TFPrvNom_Sel ;
   private String AV61TFPrvNom ;
   private String AV66TFPrdLote_Sel ;
   private String AV65TFPrdLote ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A728PrdRefPrv ;
   private String A13457PrdUbicaci ;
   private String A396EmprCod ;
   private String A794PrvNom ;
   private String A10881PrdLote ;
   private String AV76Wcwwkp89ds_2_tfprdnum ;
   private String AV77Wcwwkp89ds_3_tfprdnum_sel ;
   private String AV78Wcwwkp89ds_4_tfprdnom ;
   private String AV79Wcwwkp89ds_5_tfprdnom_sel ;
   private String AV80Wcwwkp89ds_6_tftipprddsc ;
   private String AV81Wcwwkp89ds_7_tftipprddsc_sel ;
   private String AV82Wcwwkp89ds_8_tfprdrefprv ;
   private String AV83Wcwwkp89ds_9_tfprdrefprv_sel ;
   private String AV84Wcwwkp89ds_10_tfprdubicacion ;
   private String AV85Wcwwkp89ds_11_tfprdubicacion_sel ;
   private String AV92Wcwwkp89ds_18_tfprvnom ;
   private String AV93Wcwwkp89ds_19_tfprvnom_sel ;
   private String AV94Wcwwkp89ds_20_tfprdlote ;
   private String AV95Wcwwkp89ds_21_tfprdlote_sel ;
   private String scmdbuf ;
   private String lV76Wcwwkp89ds_2_tfprdnum ;
   private String lV78Wcwwkp89ds_4_tfprdnom ;
   private String lV80Wcwwkp89ds_6_tftipprddsc ;
   private String lV82Wcwwkp89ds_8_tfprdrefprv ;
   private String lV84Wcwwkp89ds_10_tfprdubicacion ;
   private String lV92Wcwwkp89ds_18_tfprvnom ;
   private String lV94Wcwwkp89ds_20_tfprdlote ;
   private String AV47Emprcod ;
   private String AV48Prdnum ;
   private String AV49Prdnum_to ;
   private String GXv_char5[] ;
   private String AV63obsp ;
   private String GXv_char7[] ;
   private String AV64InciCPEDID ;
   private String GXv_char6[] ;
   private String GXt_char4 ;
   private String GXv_char13[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n6302TipPrdDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV75Wcwwkp89ds_1_filterfulltext ;
   private String lV75Wcwwkp89ds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08W82_A6301TipPrdCod ;
   private boolean[] P08W82_n6301TipPrdCod ;
   private String[] P08W82_A396EmprCod ;
   private byte[] P08W82_A856ValCod ;
   private String[] P08W82_A10881PrdLote ;
   private String[] P08W82_A794PrvNom ;
   private boolean[] P08W82_n794PrvNom ;
   private int[] P08W82_A795PrvNum ;
   private java.math.BigDecimal[] P08W82_A724PrdPreAct ;
   private java.math.BigDecimal[] P08W82_A732PrdStkMinU ;
   private String[] P08W82_A13457PrdUbicaci ;
   private String[] P08W82_A728PrdRefPrv ;
   private String[] P08W82_A6302TipPrdDsc ;
   private boolean[] P08W82_n6302TipPrdDsc ;
   private String[] P08W82_A718PrdNom ;
   private String[] P08W82_A719PrdNum ;
   private java.math.BigDecimal[] P08W82_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08W82_A685PrdCanRes ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class wcwwkp89export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08W82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcwwkp89ds_1_filterfulltext ,
                                          String AV77Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV76Wcwwkp89ds_2_tfprdnum ,
                                          String AV79Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV78Wcwwkp89ds_4_tfprdnom ,
                                          String AV81Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV80Wcwwkp89ds_6_tftipprddsc ,
                                          String AV83Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV82Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV85Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV84Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV86Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV87Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV88Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV89Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV90Wcwwkp89ds_16_tfprvnum ,
                                          int AV91Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV93Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV92Wcwwkp89ds_18_tfprvnom ,
                                          String AV95Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV94Wcwwkp89ds_20_tfprdlote ,
                                          byte AV96Wcwwkp89ds_22_tfvalcod ,
                                          byte AV97Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV67ValCodfrom ,
                                          short AV68ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV47Emprcod ,
                                          String AV48Prdnum ,
                                          String A396EmprCod ,
                                          String AV49Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[38];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV75Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV82Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV84Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV91Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV92Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (0==AV67ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV68ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdLote" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdLote DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ValCod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ValCod DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P08W82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08W82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
      }
   }

}

