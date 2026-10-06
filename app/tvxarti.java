package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxarti", "/app.tvxarti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxarti extends GXWebObjectStub
{
   public tvxarti( )
   {
   }

   public tvxarti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxarti.class ));
   }

   public tvxarti( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxarti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxarti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Artículos";
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

