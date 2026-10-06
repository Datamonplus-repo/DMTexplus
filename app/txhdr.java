package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txhdr", "/app.txhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txhdr extends GXWebObjectStub
{
   public txhdr( )
   {
   }

   public txhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txhdr.class ));
   }

   public txhdr( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "XHDR";
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

