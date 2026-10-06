package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpcarc", "/app.tpcarc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpcarc extends GXWebObjectStub
{
   public tpcarc( )
   {
   }

   public tpcarc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpcarc.class ));
   }

   public tpcarc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpcarc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpcarc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO CLIENTE-ARTIGO-RACABADO";
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

