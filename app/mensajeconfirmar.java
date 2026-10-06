package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mensajeconfirmar", "/app.mensajeconfirmar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmar extends GXWebObjectStub
{
   public mensajeconfirmar( )
   {
   }

   public mensajeconfirmar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmar.class ));
   }

   public mensajeconfirmar( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmar_impl(context).cleanup();
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

