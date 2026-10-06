package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens031", "/app.gestionlaboratorio.rens031"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens031 extends GXWebObjectStub
{
   public rens031( )
   {
   }

   public rens031( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens031.class ));
   }

   public rens031( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens031_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens031_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO ENSAYOS PDTES ENVIO";
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

