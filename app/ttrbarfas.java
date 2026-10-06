package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrbarfas", "/app.ttrbarfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrbarfas extends GXWebObjectStub
{
   public ttrbarfas( )
   {
   }

   public ttrbarfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrbarfas.class ));
   }

   public ttrbarfas( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrbarfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrbarfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "BARFAS";
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

