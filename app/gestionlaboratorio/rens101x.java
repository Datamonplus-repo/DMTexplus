package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens101x", "/app.gestionlaboratorio.rens101x"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens101x extends GXWebObjectStub
{
   public rens101x( )
   {
   }

   public rens101x( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens101x.class ));
   }

   public rens101x( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens101x_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens101x_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA ENSAYO SIN NADA";
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

