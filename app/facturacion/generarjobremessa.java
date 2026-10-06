package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.generarjobremessa", "/app.facturacion.generarjobremessa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generarjobremessa extends GXWebObjectStub
{
   public generarjobremessa( )
   {
   }

   public generarjobremessa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generarjobremessa.class ));
   }

   public generarjobremessa( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.facturacion.generarjobremessa_impl pgm = new app.facturacion.generarjobremessa_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generarjobremessa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generarjobremessa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Guia Remessa";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

