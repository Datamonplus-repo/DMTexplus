package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rensm016", "/app.gestionlaboratorio.rensm016"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rensm016 extends GXWebObjectStub
{
   public rensm016( )
   {
   }

   public rensm016( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rensm016.class ));
   }

   public rensm016( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rensm016_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rensm016_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LAB DIPS MODA 21 VERSION II";
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

