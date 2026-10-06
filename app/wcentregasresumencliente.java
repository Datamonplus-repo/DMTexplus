package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcentregasresumencliente", "/app.wcentregasresumencliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcentregasresumencliente extends GXWebObjectStub
{
   public wcentregasresumencliente( )
   {
   }

   public wcentregasresumencliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcentregasresumencliente.class ));
   }

   public wcentregasresumencliente( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcentregasresumencliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcentregasresumencliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCEntregas Resumen Cliente";
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

