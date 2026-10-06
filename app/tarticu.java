package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu", "/app.tarticu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu extends GXWebObjectStub
{
   public tarticu( )
   {
   }

   public tarticu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu.class ));
   }

   public tarticu( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ficha Tecnica (Articulo)";
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

