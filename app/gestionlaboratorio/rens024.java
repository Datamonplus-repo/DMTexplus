package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens024", "/app.gestionlaboratorio.rens024"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens024 extends GXWebObjectStub
{
   public rens024( )
   {
   }

   public rens024( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens024.class ));
   }

   public rens024( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens024_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens024_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIEMPO MEDIO ENTREGA";
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

