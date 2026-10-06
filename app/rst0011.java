package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0011", "/app.rst0011"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0011 extends GXWebObjectStub
{
   public rst0011( )
   {
   }

   public rst0011( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0011.class ));
   }

   public rst0011( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0011_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0011_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESTADISTICA PRODUCTOS";
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

