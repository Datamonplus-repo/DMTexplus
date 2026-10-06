package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens22m", "/app.gestionlaboratorio.rens22m"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens22m extends GXWebObjectStub
{
   public rens22m( )
   {
   }

   public rens22m( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens22m.class ));
   }

   public rens22m( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens22m_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens22m_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA ENSAYO GESINLAB";
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

