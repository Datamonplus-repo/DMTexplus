package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerwrkst extends GXProcedure
{
   public obtenerwrkst( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerwrkst.class ), "" );
   }

   public obtenerwrkst( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      obtenerwrkst.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      obtenerwrkst.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CadenaAutenticacion = AV13WebSession.getValue("TexplusNET_Autentication") ;
      AV11SdtAutenticacion.fromJSonString(AV9CadenaAutenticacion, null);
      if ( ! (GXutil.strcmp("", AV11SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03())==0) )
      {
         AV10EmprCod = httpContext.decrypt64( AV11SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena04(), AV11SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
         AV12UsurCod = httpContext.decrypt64( AV11SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03(), AV11SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
         AV14Station = httpContext.getMessage( "NE", "") + AV12UsurCod ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtenerwrkst.this.AV14Station;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Station = "" ;
      AV9CadenaAutenticacion = "" ;
      AV13WebSession = httpContext.getWebSession();
      AV11SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV10EmprCod = "" ;
      AV12UsurCod = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV14Station ;
   private String AV10EmprCod ;
   private String AV12UsurCod ;
   private String AV9CadenaAutenticacion ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private String[] aP0 ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV11SdtAutenticacion ;
}

