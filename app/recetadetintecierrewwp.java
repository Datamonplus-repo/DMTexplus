package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetadetintecierrewwp", "/app.recetadetintecierrewwp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetintecierrewwp extends GXWebObjectStub
{
   public recetadetintecierrewwp( )
   {
   }

   public recetadetintecierrewwp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetintecierrewwp.class ));
   }

   public recetadetintecierrewwp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetintecierrewwp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetintecierrewwp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta de Tinte Cierre ";
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

