package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvts002", "/app.tvts002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvts002 extends GXWebObjectStub
{
   public tvts002( )
   {
   }

   public tvts002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvts002.class ));
   }

   public tvts002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvts002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvts002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "REGISTRO 80y81";
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

