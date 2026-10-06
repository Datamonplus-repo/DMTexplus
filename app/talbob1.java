package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbob1", "/app.talbob1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbob1 extends GXWebObjectStub
{
   public talbob1( )
   {
   }

   public talbob1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbob1.class ));
   }

   public talbob1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbob1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbob1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones (Solo Agregar)";
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

