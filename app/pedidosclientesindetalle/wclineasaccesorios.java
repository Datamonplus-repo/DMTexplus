package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.wclineasaccesorios", "/app.pedidosclientesindetalle.wclineasaccesorios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wclineasaccesorios extends GXWebObjectStub
{
   public wclineasaccesorios( )
   {
   }

   public wclineasaccesorios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wclineasaccesorios.class ));
   }

   public wclineasaccesorios( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wclineasaccesorios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wclineasaccesorios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Relacion de Hdrs (Accesorios)";
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

