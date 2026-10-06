package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tldes99", "/app.tldes99"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tldes99 extends GXWebObjectStub
{
   public tldes99( )
   {
   }

   public tldes99( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tldes99.class ));
   }

   public tldes99( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tldes99_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tldes99_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Definicion todas las TABLAS";
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

