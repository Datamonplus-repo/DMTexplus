package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbpck", "/app.talbpck"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbpck extends GXWebObjectStub
{
   public talbpck( )
   {
   }

   public talbpck( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbpck.class ));
   }

   public talbpck( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbpck_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbpck_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PACKING LIST";
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

