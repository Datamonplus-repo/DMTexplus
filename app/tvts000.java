package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvts000", "/app.tvts000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvts000 extends GXWebObjectStub
{
   public tvts000( )
   {
   }

   public tvts000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvts000.class ));
   }

   public tvts000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvts000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvts000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "REGISTRO 79";
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

