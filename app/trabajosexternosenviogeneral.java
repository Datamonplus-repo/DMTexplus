package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternosenviogeneral", "/app.trabajosexternosenviogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternosenviogeneral extends GXWebObjectStub
{
   public trabajosexternosenviogeneral( )
   {
   }

   public trabajosexternosenviogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternosenviogeneral.class ));
   }

   public trabajosexternosenviogeneral( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternosenviogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternosenviogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos Externos Envio General";
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

