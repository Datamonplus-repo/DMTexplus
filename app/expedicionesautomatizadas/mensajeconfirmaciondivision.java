package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.mensajeconfirmaciondivision", "/app.expedicionesautomatizadas.mensajeconfirmaciondivision"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmaciondivision extends GXWebObjectStub
{
   public mensajeconfirmaciondivision( )
   {
   }

   public mensajeconfirmaciondivision( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmaciondivision.class ));
   }

   public mensajeconfirmaciondivision( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmaciondivision_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmaciondivision_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mensaje Confirmar";
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

