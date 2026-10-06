package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.particionhdrs2", "/app.particionhdrs2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class particionhdrs2 extends GXWebObjectStub
{
   public particionhdrs2( )
   {
   }

   public particionhdrs2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( particionhdrs2.class ));
   }

   public particionhdrs2( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new particionhdrs2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new particionhdrs2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Particion Hdrs";
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

