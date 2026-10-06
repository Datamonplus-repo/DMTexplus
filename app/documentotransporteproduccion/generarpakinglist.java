package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generarpakinglist extends GXProcedure
{
   public generarpakinglist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarpakinglist.class ), "" );
   }

   public generarpakinglist( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 )
   {
      generarpakinglist.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                             String[] aP1 )
   {
      generarpakinglist.this.AV38ImpresionGuiawwSDT = aP0;
      generarpakinglist.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV31Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV31Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV31Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV38ImpresionGuiawwSDT.size() )
      {
         AV39ImpresionGuiawwSDTItem = (app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)((app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)AV38ImpresionGuiawwSDT.elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke(), "S") == 0 )
         {
            GXv_char1[0] = AV40PathXLS ;
            GXv_char2[0] = AV24ErrorMessage ;
            GXv_char3[0] = AV40PathXLS ;
            GXv_int4[0] = AV41Lmetpi ;
            new app.documentotransporteproduccion.documentodetransporteproduccion_6(remoteHandle, context).execute( AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod(), AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod(), AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli(), AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais(), AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch(), "", GXv_char1, GXv_char2, GXv_char3, GXv_int4) ;
            generarpakinglist.this.AV40PathXLS = GXv_char1[0] ;
            generarpakinglist.this.AV24ErrorMessage = GXv_char2[0] ;
            generarpakinglist.this.AV40PathXLS = GXv_char3[0] ;
            generarpakinglist.this.AV41Lmetpi = GXv_int4[0] ;
            if ( ! (GXutil.strcmp("", AV24ErrorMessage)==0) )
            {
               System.out.println( AV24ErrorMessage );
            }
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = generarpakinglist.this.AV40PathXLS;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40PathXLS = "" ;
      AV31Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV31Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39ImpresionGuiawwSDTItem = new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
      GXv_char1 = new String[1] ;
      AV24ErrorMessage = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV41Lmetpi ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV44GXV1 ;
   private int GX_I ;
   private String AV31Copia[] ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV40PathXLS ;
   private String AV24ErrorMessage ;
   private String[] aP1 ;
   private GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> AV38ImpresionGuiawwSDT ;
   private app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem AV39ImpresionGuiawwSDTItem ;
}

