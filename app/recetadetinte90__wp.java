package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetadetinte90__wp", "/app.recetadetinte90__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte90__wp extends GXWebObjectStub
{
   public recetadetinte90__wp( )
   {
   }

   public recetadetinte90__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte90__wp.class ));
   }

   public recetadetinte90__wp( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte90__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte90__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Lineas Receta";
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

