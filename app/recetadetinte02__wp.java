package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetadetinte02__wp", "/app.recetadetinte02__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte02__wp extends GXWebObjectStub
{
   public recetadetinte02__wp( )
   {
   }

   public recetadetinte02__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte02__wp.class ));
   }

   public recetadetinte02__wp( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte02__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte02__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Receta Tinte v.02";
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

