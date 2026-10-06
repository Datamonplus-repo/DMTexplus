package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.envioensayosacliente_texplus", "/app.gestionlaboratorio.envioensayosacliente_texplus"})
@jakarta.servlet.annotation.MultipartConfig
public final  class envioensayosacliente_texplus extends GXWebObjectStub
{
   public envioensayosacliente_texplus( )
   {
   }

   public envioensayosacliente_texplus( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( envioensayosacliente_texplus.class ));
   }

   public envioensayosacliente_texplus( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new envioensayosacliente_texplus_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new envioensayosacliente_texplus_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio Ensayosa ClienteTexplus";
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

