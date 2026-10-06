package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens101", "/app.gestionlaboratorio.rens101"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens101 extends GXWebObjectStub
{
   public rens101( )
   {
   }

   public rens101( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens101.class ));
   }

   public rens101( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens101_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens101_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA ENSAYO MODA21";
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

