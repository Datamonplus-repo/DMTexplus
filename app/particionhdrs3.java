package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.particionhdrs3", "/app.particionhdrs3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class particionhdrs3 extends GXWebObjectStub
{
   public particionhdrs3( )
   {
   }

   public particionhdrs3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( particionhdrs3.class ));
   }

   public particionhdrs3( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new particionhdrs3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new particionhdrs3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Particion Hdrs (NO se utiliza)";
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

