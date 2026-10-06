package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxrenhica", "/app.tvxrenhica"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxrenhica extends GXWebObjectStub
{
   public tvxrenhica( )
   {
   }

   public tvxrenhica( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxrenhica.class ));
   }

   public tvxrenhica( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxrenhica_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxrenhica_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Remitos Entrada Hilo";
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

