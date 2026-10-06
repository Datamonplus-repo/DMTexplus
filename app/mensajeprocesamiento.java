package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mensajeprocesamiento", "/app.mensajeprocesamiento"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeprocesamiento extends GXWebObjectStub
{
   public mensajeprocesamiento( )
   {
   }

   public mensajeprocesamiento( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeprocesamiento.class ));
   }

   public mensajeprocesamiento( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeprocesamiento_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeprocesamiento_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mensaje Procesamiento";
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

