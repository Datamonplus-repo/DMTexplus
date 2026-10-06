package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tregc00", "/app.tregc00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tregc00 extends GXWebObjectStub
{
   public tregc00( )
   {
   }

   public tregc00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tregc00.class ));
   }

   public tregc00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tregc00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tregc00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MASTER DE TIPOS";
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

