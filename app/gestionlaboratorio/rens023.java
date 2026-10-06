package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens023", "/app.gestionlaboratorio.rens023"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens023 extends GXWebObjectStub
{
   public rens023( )
   {
   }

   public rens023( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens023.class ));
   }

   public rens023( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens023_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens023_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LAB DIPS CON COSTE";
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

