package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pdftinteacabado", "/app.pdftinteacabado"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pdftinteacabado extends GXWebObjectStub
{
   public pdftinteacabado( )
   {
   }

   public pdftinteacabado( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pdftinteacabado.class ));
   }

   public pdftinteacabado( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pdftinteacabado_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pdftinteacabado_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pdf Tinte Acabado";
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

