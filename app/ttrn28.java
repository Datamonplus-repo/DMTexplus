package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn28", "/app.ttrn28"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn28 extends GXWebObjectStub
{
   public ttrn28( )
   {
   }

   public ttrn28( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn28.class ));
   }

   public ttrn28( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn28_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn28_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Combinaciones";
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

