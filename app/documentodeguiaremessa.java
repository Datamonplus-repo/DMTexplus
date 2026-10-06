package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodeguiaremessa extends GXProcedure
{
   public documentodeguiaremessa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodeguiaremessa.class ), "" );
   }

   public documentodeguiaremessa( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXSimpleCollection<String> executeUdp( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                                                 short aP1 )
   {
      documentodeguiaremessa.this.aP2 = new GXSimpleCollection[] {new GXSimpleCollection<String>(String.class, "internal", "")};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                        short aP1 ,
                        GXSimpleCollection<String>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                             short aP1 ,
                             GXSimpleCollection<String>[] aP2 )
   {
      documentodeguiaremessa.this.AV24ImpresionDeGuiawwSDT = aP0;
      documentodeguiaremessa.this.AV23Copias2 = aP1;
      documentodeguiaremessa.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17DateStr = GXutil.trim( GXutil.str( GXutil.day( Gx_date), 10, 0)) + GXutil.trim( GXutil.str( GXutil.month( Gx_date), 10, 0)) + GXutil.trim( GXutil.str( GXutil.year( Gx_date), 10, 0)) ;
      AV17DateStr = GXutil.trim( AV17DateStr) ;
      AV16PathPDF = ((app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)AV24ImpresionDeGuiawwSDT.elementAt(-1+1)).getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf() ;
      AV18PathPDF_Out = AV16PathPDF + GXutil.format( httpContext.getMessage( "GuiaRemessa_%1.pdf", ""), AV17DateStr, "", "", "", "", "", "", "", "") ;
      AV20isLog = false ;
      if ( AV20isLog )
      {
         System.out.println( "---------------------------------------------------------" );
         System.out.println( httpContext.getMessage( "Generando Guias de Remessa - Agrupadas ", "") );
         System.out.println( httpContext.getMessage( "Path: ", "")+AV18PathPDF_Out );
      }
      new app.documentotransporteproduccion.generardeguiaremessa(remoteHandle, context).execute( AV24ImpresionDeGuiawwSDT, AV23Copias2, AV18PathPDF_Out) ;
      AV25NombresAdjuntos.add(AV18PathPDF_Out, 0);
      if ( AV20isLog )
      {
         System.out.println( httpContext.getMessage( "Finalizado generacion Guias de Remessa ", "") );
         System.out.println( "---------------------------------------------------------" );
      }
      if ( AV20isLog )
      {
         System.out.println( "---------------------------------------------------------" );
         System.out.println( httpContext.getMessage( "Generando Paking list ", "") );
      }
      GXv_objcol_svchar1[0] = AV19PathXLS_Out ;
      new app.documentotransporteproduccion.generarpakinglists(remoteHandle, context).execute( AV24ImpresionDeGuiawwSDT, GXv_objcol_svchar1) ;
      AV19PathXLS_Out = GXv_objcol_svchar1[0] ;
      if ( AV20isLog )
      {
         System.out.println( httpContext.getMessage( "Path: ", "")+AV19PathXLS_Out.toxml(false, true, "Collection", "") );
         System.out.println( httpContext.getMessage( "Finalizado generacion Paking List ", "") );
         System.out.println( "---------------------------------------------------------" );
      }
      AV30GXV1 = 1 ;
      while ( AV30GXV1 <= AV19PathXLS_Out.size() )
      {
         AV26PathXLS = (String)AV19PathXLS_Out.elementAt(-1+AV30GXV1) ;
         AV25NombresAdjuntos.add(AV26PathXLS, 0);
         AV30GXV1 = (int)(AV30GXV1+1) ;
      }
      System.out.println( httpContext.getMessage( "NombresAdjuntos ", "") );
      System.out.println( AV25NombresAdjuntos.toxml(false, true, "Collection", "") );
      System.out.println( "---------------------------------------------------------" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentodeguiaremessa.this.AV25NombresAdjuntos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17DateStr = "" ;
      Gx_date = GXutil.nullDate() ;
      AV16PathPDF = "" ;
      AV18PathPDF_Out = "" ;
      AV19PathXLS_Out = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_objcol_svchar1 = new GXSimpleCollection[1] ;
      AV26PathXLS = "" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short AV23Copias2 ;
   private short Gx_err ;
   private int AV30GXV1 ;
   private java.util.Date Gx_date ;
   private boolean AV20isLog ;
   private String AV17DateStr ;
   private String AV16PathPDF ;
   private String AV18PathPDF_Out ;
   private String AV26PathXLS ;
   private GXSimpleCollection<String>[] aP2 ;
   private GXSimpleCollection<String> AV25NombresAdjuntos ;
   private GXSimpleCollection<String> AV19PathXLS_Out ;
   private GXSimpleCollection<String> GXv_objcol_svchar1[] ;
   private GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> AV24ImpresionDeGuiawwSDT ;
}

