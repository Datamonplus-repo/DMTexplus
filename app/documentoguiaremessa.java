package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentoguiaremessa extends GXProcedure
{
   public documentoguiaremessa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentoguiaremessa.class ), "" );
   }

   public documentoguiaremessa( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      documentoguiaremessa.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                        short aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      documentoguiaremessa.this.AV10ImpresionGuiawwSDT = aP0;
      documentoguiaremessa.this.AV23Copias2 = aP1;
      documentoguiaremessa.this.aP2 = aP2;
      documentoguiaremessa.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17DateStr = GXutil.trim( GXutil.str( GXutil.day( Gx_date), 10, 0)) + GXutil.trim( GXutil.str( GXutil.month( Gx_date), 10, 0)) + GXutil.trim( GXutil.str( GXutil.year( Gx_date), 10, 0)) ;
      AV17DateStr = GXutil.trim( AV17DateStr) ;
      AV16PathPDF = ((app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)AV10ImpresionGuiawwSDT.elementAt(-1+1)).getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf() ;
      AV18PathPDF_Out = AV16PathPDF + GXutil.format( httpContext.getMessage( "GuiaRemessa_%1.pdf", ""), AV17DateStr, "", "", "", "", "", "", "", "") ;
      AV20isLog = false ;
      if ( AV20isLog )
      {
         System.out.println( "---------------------------------------------------------" );
         System.out.println( httpContext.getMessage( "Generando Guias de Remessa - Agrupadas ", "") );
         System.out.println( httpContext.getMessage( "Path: ", "")+AV18PathPDF_Out );
      }
      new app.documentotransporteproduccion.generarguiaremessa(remoteHandle, context).execute( AV10ImpresionGuiawwSDT, AV23Copias2, AV18PathPDF_Out) ;
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
      GXv_char1[0] = AV19PathXLS_Out ;
      new app.documentotransporteproduccion.generarpakinglist(remoteHandle, context).execute( AV10ImpresionGuiawwSDT, GXv_char1) ;
      documentoguiaremessa.this.AV19PathXLS_Out = GXv_char1[0] ;
      if ( AV20isLog )
      {
         System.out.println( httpContext.getMessage( "Path: ", "")+AV19PathXLS_Out );
         System.out.println( httpContext.getMessage( "Finalizado generacion Paking List ", "") );
         System.out.println( "---------------------------------------------------------" );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentoguiaremessa.this.AV18PathPDF_Out;
      this.aP3[0] = documentoguiaremessa.this.AV19PathXLS_Out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18PathPDF_Out = "" ;
      AV19PathXLS_Out = "" ;
      AV17DateStr = "" ;
      Gx_date = GXutil.nullDate() ;
      AV16PathPDF = "" ;
      GXv_char1 = new String[1] ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short AV23Copias2 ;
   private short Gx_err ;
   private String GXv_char1[] ;
   private java.util.Date Gx_date ;
   private boolean AV20isLog ;
   private String AV18PathPDF_Out ;
   private String AV19PathXLS_Out ;
   private String AV17DateStr ;
   private String AV16PathPDF ;
   private String[] aP3 ;
   private String[] aP2 ;
   private GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> AV10ImpresionGuiawwSDT ;
}

